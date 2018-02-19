package com.example.hystrixdemo.service;

import com.example.hystrixdemo.model.MemberResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ExternalService {
    private RestTemplate restTemplate;

    public ExternalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MemberResponse findAllBnk48Members() {
        String url = "https://www.api.bnk48.com/api/members";
        return restTemplate.getForEntity(url, MemberResponse.class).getBody();
    }
}
