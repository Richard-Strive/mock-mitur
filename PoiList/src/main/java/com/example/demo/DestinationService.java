package com.example.demo;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
@Service
public class DestinationService {


    Destinations destinations;
    @Autowired
    public DestinationService(Destinations destinations) {
        this.destinations = destinations;
    }


    public List<Destinations> readPoiJson() {

        String filePath =  new File("").getAbsolutePath();

        JSONParser parser = new JSONParser();
        List<Destinations> lista = new ArrayList<>();
        try {
           Resource resource = new ClassPathResource("classpath:destination.json");
           InputStream completeFilePat = resource.getInputStream();
            JSONArray a = (JSONArray) parser.parse(org.apache.commons.io.IOUtils.toString(completeFilePat, StandardCharsets.UTF_8.name()));

            for(Object o: a) {
                JSONObject jsonObject = (JSONObject) o;
                JSONArray cmsDestinations = (JSONArray) jsonObject.get("cmsDestinations");
                for (Object c : cmsDestinations) {
                    JSONObject jsonObject1 = (JSONObject) c;
                    String officialName = (String) jsonObject1.get("officialName");
                    String localizedPageName = (String) jsonObject1.get("localizedPageName");
                    boolean completed = (boolean) jsonObject1.get("completed");
                    boolean suggested = (boolean) jsonObject1.get("suggested");
                    String identifier = (String) jsonObject1.get("identifier");
                    String placeID = (String) jsonObject1.get("placeID");
                    JSONObject geometryPoi = (JSONObject) jsonObject1.get("geometry");
                    Geometry geometry = new Geometry((double) geometryPoi.get("lat"), (double) geometryPoi.get("lng"));
                    JSONArray images= (JSONArray) jsonObject1.get("images");
                       try {
                           for (Object x : images) {
                               JSONObject jsonObject2 = (JSONObject) x;

                           }
                       }catch (Exception ex){

                       }
                    JSONObject descriptionPoi = (JSONObject) jsonObject1.get("description");
                    Description description = new Description((String) jsonObject1.get("plain_text"));
                    JSONObject destinationDescriptionShortTypePoi = (JSONObject) jsonObject1.get("destinationDescriptionShortType");
                    DestinationDescriptionShortType destinationDescriptionShortType = new DestinationDescriptionShortType((String) jsonObject1.get("html"));
                    JSONObject destinationDescriptionLongPoi = (JSONObject) jsonObject1.get("destinationDescriptionLong");
                    DestinationDescriptionLong destinationDescriptionLong = new DestinationDescriptionLong((String) jsonObject1.get("html"));
                    String owner = (String) jsonObject1.get("owner");
                    long userPoints =(long) jsonObject1.get("userPoints");
                    long numRating = (long) jsonObject1.get("numRating");
                    String price=(String) jsonObject1.get("price");
                    String category = (String) jsonObject1.get("category");
                    long rating = (long) jsonObject1.get("rating");
                    JSONObject opening_hoursPoi = (JSONObject) jsonObject1.get("opening_hours");
                    Opening_hours opening_hours = new Opening_hours((String) jsonObject1.get("html"));
                    ArrayList<String> primaryTag = (ArrayList<String>) jsonObject1.get("primaryTag");
                    long faxNumber = (long) jsonObject1.get("faxNumber");
                    String country = (String) jsonObject1.get("country");

                    Destinations destinations = new Destinations(officialName, localizedPageName, completed, suggested, identifier, rating,placeID, geometry, images, description, destinationDescriptionShortType, destinationDescriptionLong, owner, category, opening_hours, primaryTag, faxNumber, country, numRating,userPoints,price);

                                lista.add(destinations);
                }
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
                        return lista;
    }

    public List<Destinations> getPoi(List<Destinations> lista, List<Destinations> destinationsBounds){
        for(int i=0;i< lista.size();i++){
            if(ControllerPoi.destinationType!=null){
                if(lista.get(i).getCategory().contains(ControllerPoi.destinationType)&&lista.get(i).getGeometry().getLat()>ControllerPoi.filterBounds.getSouthwest().getLat()&&lista.get(i).getGeometry().getLat()<ControllerPoi.filterBounds.getNortheast().getLat()){
                    if(lista.get(i).getGeometry().getLng()<ControllerPoi.filterBounds.getNortheast().getLng()&&lista.get(i).getGeometry().getLng()>ControllerPoi.filterBounds.getSouthwest().getLng()){
                        destinationsBounds.add(lista.get(i));
                    }
                }
            }else{
                destinationsBounds.add(lista.get(i));
            }

        }
        return destinationsBounds;
    }
}
