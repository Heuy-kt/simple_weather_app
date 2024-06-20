package com.heuy.kt;

import com.heuy.kt.models.WeatherMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("v1")
public record WeatherController(WeatherService weatherService) {

    static String apiKey = "e691951f383647d3b56114025242006";

    @GetMapping("get_maps")
    public String getMaps(@RequestParam("q") String location){
        WeatherMap wp = weatherService.get1Map(apiKey, location).block();
        String country = wp.getLocation().country;
        double temp = wp.getCurrent().tempC;
        return "you're currently in "+country+" and the temp is "+temp;
    }

}
