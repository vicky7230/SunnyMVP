package com.vicky7230.sunnymvp.data.network;

import com.vicky7230.sunnymvp.data.network.model.Forecast.Forecast;
import com.vicky7230.sunnymvp.data.network.model.Weather.CurrentWeather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by agrim on 14/6/17.
 */

public interface WeatherService {

    @GET("weather")
    Call<CurrentWeather> getCurrentLocationWeather(
            @Query("lat") String lat,
            @Query("lon") String lon,
            @Query("appid") String appId,
            @Query("units") String units
    );

    @GET("weather")
    Call<CurrentWeather> getCityWeather(
            @Query("q") String cityName,
            @Query("appid") String appId,
            @Query("units") String units
    );

    @GET("forecast")
    Call<Forecast> getCurrentLocationForecast(
            @Query("lat") String lat,
            @Query("lon") String lon,
            @Query("appid") String appId,
            @Query("units") String units,
            @Query("cnt") String count
    );

    @GET("forecast")
    Call<Forecast> getCityForecast(
            @Query("q") String cityName,
            @Query("appid") String appId,
            @Query("units") String units,
            @Query("cnt") String count
    );

}
