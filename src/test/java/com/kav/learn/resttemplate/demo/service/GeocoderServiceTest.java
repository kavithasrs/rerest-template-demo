package com.kav.learn.resttemplate.demo.service;

import com.kav.learn.resttemplate.demo.entities.Site;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class GeocoderServiceTest {

    private Logger logger = LoggerFactory.getLogger(GeocoderServiceTest.class);

    @Autowired
    private GeocoderService geocoderService;

    @Test
    void getLatLngForGoogleHeadquarters() {
        Site googleAddress = geocoderService.getLatLng("1600 Ampitheatre Parkway", "Mountain View", "CA");
        logger.info(googleAddress.toString());
        assertEquals(37.42, googleAddress.getLatitude(), 0.01);
        assertEquals(-122.08, googleAddress.getLongitude(), 0.01);
    }

    @Test
    void getLatLngWithoutStreet() {
        Site oReillyAddress = geocoderService.getLatLng("Boston", "MA");
        logger.info(oReillyAddress.toString());
        assertEquals(42.36, oReillyAddress.getLatitude(), 0.01);
        assertEquals(-71.06, oReillyAddress.getLongitude(), 0.01);

    }
}