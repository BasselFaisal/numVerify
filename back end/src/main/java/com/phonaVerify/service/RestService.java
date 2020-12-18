package com.phonaVerify.service;

import com.phonaVerify.model.request.Call;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
   
    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }
    public Call getPostsPlainJSON(String number) {
        String url = "http://apilayer.net/api/validate?access_key=224ffa796cde8880bab6de23ab7ffc4a&number="+number;

        return this.restTemplate.getForObject(url, Call.class);
    }
    }

