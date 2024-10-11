package org.abigotado.app.weather.data.repositories;

import org.abigotado.app.weather.data.datasources.YaWeatherService;
import org.abigotado.app.weather.domain.interfaces.IWeatherRepository;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;

public class WeatherRepository implements IWeatherRepository {

    private final YaWeatherService yaWeatherService;

    public WeatherRepository(YaWeatherService yaWeatherService) {
        this.yaWeatherService = yaWeatherService;
    }

    @Override
    public Weather getWeather() throws IOException, InterruptedException {
        return yaWeatherService.getWeather();
    }
}
