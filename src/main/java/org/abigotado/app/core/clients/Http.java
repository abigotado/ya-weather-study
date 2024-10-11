package org.abigotado.app.core.clients;

import io.github.cdimascio.dotenv.Dotenv;

import java.net.URI;
import java.net.http.HttpClient;
import java.util.Map;

public class Http {
    private static final String yaUrlString = Dotenv.load().get("YA_URL");
    private static final StringBuilder uriStringBuilder = new StringBuilder();

    public static final HttpClient client = HttpClient.newHttpClient();
    public static final String yaWeatherApiKey = Dotenv.load().get("YA_WEATHER_KEY");
    public static final String yaWeatherApiKeyHeader = "X-Yandex-Weather-Key";

    public static URI buildYaWeatherUri(String endpoint) {
        uriStringBuilder
                .append(Http.yaUrlString)
                .append(endpoint);

        return URI.create(uriStringBuilder.toString());
    }

    public static URI buildYaWeatherUri(String endpoint, Map<String, String> queryParameters) {
        uriStringBuilder
                .append(Http.yaUrlString)
                .append(endpoint);

        if (queryParameters != null) {
            for (Map.Entry<String, String> entry : queryParameters.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    continue;
                }

                if (uriStringBuilder.toString().endsWith(endpoint)) {
                    uriStringBuilder.append('?');
                } else {
                    uriStringBuilder.append('&');
                }
                uriStringBuilder
                        .append(entry.getKey())
                        .append("=")
                        .append(entry.getValue());
            }
        }

        return URI.create(uriStringBuilder.toString());
    }
}
