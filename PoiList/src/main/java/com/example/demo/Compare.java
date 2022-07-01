package com.example.demo;

import java.util.Comparator;

public class Compare implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Destinations destinations = (Destinations) o1;
        Destinations destinations1 = (Destinations) o2;


        if(Math.sqrt(Math.pow(((destinations.getGeometry().getLat()- ControllerPoi.latitudine)),2)+ Math.pow((destinations.getGeometry().getLng()- ControllerPoi.longitudine),2)) ==
                Math.sqrt(Math.pow(((destinations1.getGeometry().getLat()- ControllerPoi.latitudine)),2)+ Math.pow((destinations1.getGeometry().getLng()- ControllerPoi.longitudine),2))){

            return 1;
        }
        else if (Math.sqrt(Math.pow((destinations.getGeometry().getLat()- ControllerPoi.latitudine),2)+ Math.pow((destinations.getGeometry().getLng()- ControllerPoi.longitudine),2)) >
                Math.sqrt(Math.pow((destinations1.getGeometry().getLat()- ControllerPoi.latitudine),2)+ Math.pow((destinations1.getGeometry().getLng()- ControllerPoi.longitudine),2))) {

            return 0;
        }

        return -1;
    }
}
