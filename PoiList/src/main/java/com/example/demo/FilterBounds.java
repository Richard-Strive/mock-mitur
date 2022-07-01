package com.example.demo;


public class FilterBounds {


    private Geometry southwest;
    private Geometry northeast;

    public FilterBounds(Geometry southwest, Geometry northeast) {
        this.southwest = southwest;
        this.northeast = northeast;
    }

    public Geometry getSouthwest() {
        return southwest;
    }

    public void setSouthwest(Geometry southwest) {
        this.southwest = southwest;
    }

    public Geometry getNortheast() {
        return northeast;
    }

    public void setNortheast(Geometry northeast) {
        this.northeast = northeast;
    }

    @Override
    public String toString() {
        return "FilterBounds{" +
                "southwest=" + southwest +
                ", northeast=" + northeast +
                '}';
    }
}
