package org.abigotado.app.weather.controllers;

import org.abigotado.app.weather.domain.interfaces.IWeatherRepository;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;

public class WeatherController {
    private final IWeatherRepository weatherRepository;

    public WeatherController(IWeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public Weather getWeather() throws IOException, InterruptedException {
        return weatherRepository.getWeather();
    }
}
