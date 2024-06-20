
package com.heuy.kt.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "current"
})
@Generated("jsonschema2pojo")
@Data
public class WeatherMap {

    @JsonProperty("location")
    public Location location;
    @JsonProperty("current")
    public Current current;

}
