package com.example.hystrixdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Member {

    @JsonProperty("created")
    private long created;

    @JsonProperty("birth_date")
    private long birthDate;

    @JsonProperty("last_name")
    private Language lastName;

    @JsonProperty("avatar_image")
    private String avatarImage;

    @JsonProperty("team")
    private int team;

    @JsonProperty("instagram")
    private String instagram;

    @JsonProperty("profile_image")
    private String profileImage;

    @JsonProperty("province")
    private String province;

    @JsonProperty("nickname")
    private Language nickname;

    @JsonProperty("blood_group")
    private int bloodGroup;

    @JsonProperty("id")
    private int id;

    @JsonProperty("position")
    private int position;

    @JsonProperty("first_name")
    private Language firstName;

    @JsonProperty("slug")
    private String slug;

    @JsonProperty("changed")
    private long changed;

    @JsonProperty("height")
    private int height;

    @JsonProperty("profile_image_2x")
    private String profileImage2x;

    @JsonProperty("status")
    private int status;
}