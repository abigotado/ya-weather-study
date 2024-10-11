package org.abigotado.app.weather.domain.interfaces;

import org.abigotado.app.weather.domain.models.Weather;

import java.io.IOException;

public interface IWeatherRepository {
    Weather getWeather() throws IOException, InterruptedException;

    Weather getWeather(double lat, double lon) throws IOException, InterruptedException;
}
