package org.abigotado.app.weather.views;

import org.abigotado.app.weather.controllers.WeatherController;
import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;
import java.util.Scanner;

import static org.abigotado.app.core.utils.StringUtils.*;

public class WeatherConsoleView {
    private static final Scanner scanner = new Scanner(System.in);

    private final WeatherController controller;

    public WeatherConsoleView(WeatherController controller) {
        this.controller = controller;
    }

    private static void showIntroduction() {
        System.out.println(INTRODUCTION_STRING);
    }

    private static double setCoordinate(String introduction) {
        System.out.println(introduction); while (!scanner.hasNextDouble()) {
            System.out.println(INCORRECT_COORDINATES_STRING); scanner.next();
        }

        return scanner.nextDouble();
    }

    public void build() {
        showIntroduction();

        try {
            Weather weather = fetchWeather(); System.out.println(TEMPERATURE_STRING + weather.getFact().getTemp());
            final int averageTemperature = controller.calculateAverageTemperature(weather);
            System.out.println(AVERAGE_TEMPERATURE_STRING + averageTemperature);
        } catch (Exception e) {
            System.out.println(PROGRAM_CLOSED_ERROR_STRING);
        } finally {
            scanner.close();
        }

    }

    private Weather fetchWeather() throws IOException, InterruptedException {
        String answer = scanner.next();

        while (!answer.equals("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println(INCORRECT_ANSWER_STRING); answer = scanner.next();
        }

        if (answer.equalsIgnoreCase("y")) {
            return getWeatherByCoordinates();
        }

        return getDefaultWeather();
    }

    private Weather getDefaultWeather() throws IOException, InterruptedException {
        System.out.println(GETTING_WEATHER_STRING); return controller.getWeather();

    }

    private Weather getWeatherByCoordinates() throws IOException, InterruptedException {
        double lat; double lon;

        lat = setCoordinate(ENTER_LAT_STRING); lon = setCoordinate(ENTER_LON_STRING);

        System.out.println(GETTING_WEATHER_STRING); return controller.getWeather(lat, lon);

    }
}
