package org.abigotado.app.weather.data.datasources;

import org.abigotado.app.core.clients.Http;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.Map;

import static org.abigotado.app.core.utils.JsonSerializable.reader;
import static org.abigotado.app.core.utils.JsonSerializable.writer;

public class YaWeatherService {
    private static final String forecastEndpoint = "forecast";
    private static final String latQueryString = "-34.56504480503466";
    private static final String lonQueryString = "-58.439427";

    public Weather getWeather() throws IOException, InterruptedException {

        final Map<String, String> queryParameters = Map.of("lat", latQueryString, "lon", lonQueryString);
        final URI uri = Http.buildYaWeatherUri(forecastEndpoint, queryParameters);

        HttpRequest request = HttpRequest.newBuilder()
                                         .uri(uri)
                                         .header(Http.yaWeatherApiKeyHeader, Http.yaWeatherApiKey)
                                         .GET()
                                         .build();

        try {
            HttpResponse<String> response = Http.client.send(request, HttpResponse.BodyHandlers.ofString());

            Object json = reader.readValue(response.body());

            String prettyJsonString = writer.writeValueAsString(json);

            Weather weather = reader.readValue(response.body(), Weather.class);

            System.out.println("Response Code: " + response.statusCode());
            System.out.println("Response Body: " + prettyJsonString);

            return weather;
        } catch (Exception e) {
            System.err.println("Error making HTTP request: " + e.getMessage() + "\n" + Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }
}
