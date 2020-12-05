package com.kav.learn.resttemplate.demo.model;


import java.util.List;

public class GeocodingResponse {
    private List<Results> results;
    private String status;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation(){
        return results.get(0).getGeometry().getLocation();
    }

    public String getFormattedAddress(){
        return results.get(0).getFormattedAddress();
    }
}
