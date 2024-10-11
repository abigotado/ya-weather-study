package org.abigotado.app.weather.views;

import org.abigotado.app.weather.controllers.WeatherController;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;

public class WeatherConsoleView {

    private final WeatherController controller;

    public WeatherConsoleView(WeatherController controller) {
        this.controller = controller;
    }

    public void build() throws IOException, InterruptedException {
        Weather weather = controller.getWeather();

        System.out.println(weather);
    }
}
