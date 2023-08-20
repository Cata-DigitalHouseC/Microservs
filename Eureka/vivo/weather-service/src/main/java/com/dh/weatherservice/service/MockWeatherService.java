package com.dh.weatherservice.service;


import org.springframework.stereotype.Service;

@Service
public class MockWeatherService implements WeatherService {
    @Override
    public Integer getTemperature(String city, String country) {
        return 20;
    }
}
