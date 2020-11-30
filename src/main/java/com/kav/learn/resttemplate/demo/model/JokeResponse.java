package com.kav.learn.resttemplate.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JokeResponse {
    private String status;
    private Value value;
}
