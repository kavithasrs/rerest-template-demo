package com.kav.learn.resttemplate.demo.service;



import com.kav.learn.resttemplate.demo.entities.Site;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class GeocoderService {
    private static final String BASE = "https://maps.googleapis.com/maps/api/geocode/json";
    private static final String KEY = "AIzaSyDw_d6dfxDEI7MAvqfGXEIsEMwjC1PWRno";

    private RestTemplate restTemplate;

    @Autowired
    public GeocoderService(RestTemplateBuilder builder){
        restTemplate = builder.build();
    }

    public Site getLetLng(String... address){
        String encodedAddress = Stream.of(address)
                         .map(component -> URLEncoder.encode(component, StandardCharsets.UTF_8))
                         .collect(Collectors.joining(","));

    }
}
