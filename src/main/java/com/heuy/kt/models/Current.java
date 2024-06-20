
package com.heuy.kt.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "last_updated",
    "temp_c",
    "condition",
    "humidity",
    "cloud",
    "uv",
    "air_quality"
})
@Generated("jsonschema2pojo")
@Data
public class Current {

    @JsonProperty("last_updated")
    public String lastUpdated;
    @JsonProperty("temp_c")
    public Float tempC;
    @JsonProperty("condition")
    public Condition condition;
    @JsonProperty("humidity")
    public Integer humidity;
    @JsonProperty("cloud")
    public Integer cloud;
    @JsonProperty("uv")
    public Integer uv;
    @JsonProperty("air_quality")
    public AirQuality airQuality;

}
