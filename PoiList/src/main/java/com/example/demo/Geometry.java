package com.example.demo;

public class Geometry {

    double lat;
    double lng;

    public Geometry(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public Geometry() {

    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }


    @Override
    public String toString() {
        return "Geometry{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
