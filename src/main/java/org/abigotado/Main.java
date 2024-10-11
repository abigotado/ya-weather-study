package org.abigotado;

import org.abigotado.app.weather.controllers.WeatherController;
import org.abigotado.app.weather.data.datasources.YaWeatherService;
import org.abigotado.app.weather.data.repositories.WeatherRepository;
import org.abigotado.app.weather.views.WeatherConsoleView;

import java.io.IOException;

public class Main {
    private static final YaWeatherService yaWeatherService = new YaWeatherService();
    private static final WeatherRepository weatherRepository = new WeatherRepository(yaWeatherService);
    private static final WeatherController weatherController = new WeatherController(weatherRepository);
    private static final WeatherConsoleView weatherConsoleView = new WeatherConsoleView(weatherController);

    public static void main(String[] args) throws IOException, InterruptedException {
        weatherConsoleView.build();
    }
}