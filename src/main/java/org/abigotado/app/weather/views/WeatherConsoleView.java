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
        System.out.println(introductionString);
    }

    private static double setCoordinate(String introduction) {
        System.out.println(introduction); while (!scanner.hasNextDouble()) {
            System.out.println(incorrectCoordinatesString); scanner.next();
        }

        return scanner.nextDouble();
    }

    public void build() {
        showIntroduction();

        try {
            Weather weather = fetchWeather(); System.out.println(temperatureString + weather.getFact().getTemp());
            final int averageTemperature = controller.calculateAverageTemperature(weather);
            System.out.println(averageTemperatureString + averageTemperature);
        } catch (Exception e) {
            System.out.println(programClosedErrorString);
        } finally {
            scanner.close();
        }

    }

    private Weather fetchWeather() throws IOException, InterruptedException {
        String answer = scanner.next();

        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println(incorrectAnswerString); answer = scanner.next();
        }

        if (answer.equals("y")) {
            return getWeatherByCoordinates();
        }

        return getDefaultWeather();
    }

    private Weather getDefaultWeather() throws IOException, InterruptedException {
        System.out.println(gettingWeatherString); return controller.getWeather();

    }

    private Weather getWeatherByCoordinates() throws IOException, InterruptedException {
        double lat; double lon;

        lat = setCoordinate(enterLatString); lon = setCoordinate(enterLonString);

        System.out.println(gettingWeatherString); return controller.getWeather(lat, lon);

    }
}
