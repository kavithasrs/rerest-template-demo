package com.kav.learn.resttemplate.demo.model;

import lombok.Getter;
import lombok.Setter;

/** Java Class to map the Json response */

@Getter
@Setter

public class JokeResponse {
    private String type;
    private Value value;
}
