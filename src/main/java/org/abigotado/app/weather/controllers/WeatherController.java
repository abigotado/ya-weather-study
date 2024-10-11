package org.abigotado.app.weather.controllers;

import org.abigotado.app.weather.domain.interfaces.IWeatherRepository;
import org.abigotado.app.weather.domain.models.Forecast;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;
import java.util.List;

public class WeatherController {
    private final IWeatherRepository weatherRepository;

    public WeatherController(IWeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public Weather getWeather() throws IOException, InterruptedException {
        return weatherRepository.getWeather();
    }

    public Weather getWeather(double lat, double lon) throws IOException, InterruptedException {
        return weatherRepository.getWeather(lat, lon);
    }

    public int calculateAverageTemperature(Weather weather) {
        final List<Forecast> forecasts = weather.getForecasts(); final List<Integer> temperatures = forecasts.stream()
                                                                                                             .map(forecast -> forecast.getParts()
                                                                                                                                      .getDay()
                                                                                                                                      .getTempAvg())
                                                                                                             .toList();
        final double averageTemperature = temperatures.stream().mapToInt(Integer::intValue).average().orElse(0);

        return (int) Math.round(averageTemperature);
    }
}
