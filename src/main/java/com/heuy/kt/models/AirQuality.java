
package com.heuy.kt.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "co",
    "no2",
    "o3",
    "so2",
    "pm2_5",
    "pm10",
    "us-epa-index",
    "gb-defra-index"
})
@Generated("jsonschema2pojo")
@Data
public class AirQuality {

    @JsonProperty("co")
    public Float co;
    @JsonProperty("no2")
    public Float no2;
    @JsonProperty("o3")
    public Float o3;
    @JsonProperty("so2")
    public Float so2;
    @JsonProperty("pm2_5")
    public Float pm25;
    @JsonProperty("pm10")
    public Float pm10;
    @JsonProperty("us-epa-index")
    public Integer usEpaIndex;
    @JsonProperty("gb-defra-index")
    public Integer gbDefraIndex;

}
