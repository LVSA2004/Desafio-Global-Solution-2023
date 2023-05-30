package br.com.fiap.gsjava.controllers;

import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clima")
public class WeatherAPI {

    private OWM owm = new OWM("c0f79194c5cdfe6db72de0f4c5e49855");

    @GetMapping("/{city}")
    public CurrentWeather getWeatherByCity(@PathVariable String city) throws APIException {
        return owm.currentWeatherByCityName(city);
    }

    @PostMapping("/")
    public void createWeather(@RequestBody CurrentWeather weather) {
        // Implement logic to create weather data (if applicable)
    }

    @PutMapping("/{city}")
    public void updateWeather(@PathVariable String city, @RequestBody CurrentWeather weather) {
        // Implement logic to update weather data for the specified city (if applicable)
    }

    @DeleteMapping("/{city}")
    public void deleteWeather(@PathVariable String city) {
        // Implement logic to delete weather data for the specified city (if applicable)
    }
}

