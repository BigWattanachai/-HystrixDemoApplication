package com.example.hystrixdemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Language {

    @JsonProperty("th")
    private String th;

    @JsonProperty("en")
    private String en;
}