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
import static org.abigotado.app.core.utils.StringUtils.*;

public class YaWeatherService {
    private static final String forecastEndpoint = "forecast";

    public Weather getWeather(double lat, double lon) throws IOException, InterruptedException {

        final Map<String, String> queryParameters = Map.of("lat", Double.toString(lat), "lon", Double.toString(lon));
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

            System.out.println(RESPONSE_CODE_STRING + response.statusCode());
            System.out.println(RESPONSE_BODY_STRING + prettyJsonString);

            return weather;
        } catch (Exception e) {
            System.err.println(ERROR_MAKING_HTTP_REQUEST_STRING
                               + e.getMessage()
                               + "\n" + STACK_TRACE_STRING
                               + Arrays.toString(e.getStackTrace()));
            throw e;
        }
    }
}
