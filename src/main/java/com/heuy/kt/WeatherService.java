package com.heuy.kt;

import com.heuy.kt.models.WeatherMap;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherService {
    private String baseUrl = "http://api.weatherapi.com/v1/current.json";
//    private String apikey = "e691951f383647d3b56114025242006";

    WebClient client = WebClient.create(baseUrl);
    public Mono<WeatherMap> get1Map(String key, String location){
        Mono<WeatherMap> result = client.
                get()
                .uri(
                        uriBuilder -> uriBuilder
                                .queryParam("key", key)
                                .queryParam("q", location)
                                .build()
                )
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(WeatherMap.class);

        return result;
    }
}
