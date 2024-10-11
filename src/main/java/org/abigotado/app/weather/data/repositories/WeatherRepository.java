package org.abigotado.app.weather.data.repositories;

import org.abigotado.app.weather.data.datasources.YaWeatherService;
import org.abigotado.app.weather.domain.interfaces.IWeatherRepository;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;

public class WeatherRepository implements IWeatherRepository {
    private static final double defaultLat = -34.56504480503466;
    private static final double defaultLon = -58.439427;

    private final YaWeatherService yaWeatherService;

    public WeatherRepository(YaWeatherService yaWeatherService) {
        this.yaWeatherService = yaWeatherService;
    }

    @Override
    public Weather getWeather() throws IOException, InterruptedException {
        return yaWeatherService.getWeather(defaultLat, defaultLon);
    }

    public Weather getWeather(double lat, double lon) throws IOException, InterruptedException {
        return yaWeatherService.getWeather(lat, lon);
    }
}
