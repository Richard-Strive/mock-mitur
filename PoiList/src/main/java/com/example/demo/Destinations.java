package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Destinations {

    private String officialName;
    private String localizedPageName;
    private boolean completed;
    private String identifier;
    private String placeID;
    private Geometry geometry;
    private ArrayList<Images> images;


    private boolean suggested;
    private Description description;

    private DestinationDescriptionShortType destinationDescriptionShortType;

    private DestinationDescriptionLong destinationDescriptionLong;
    private String owner;
    private String category;

    private Opening_hours opening_hours;
    private List<String> primaryTag;
    private long faxNumber;
    private String country;
    private long rating;
    private long numRating;
    private long userPoints;
    private String price;




    public Destinations(String officialName, String localizedPageName, boolean completed, boolean suggested,
                        String identifier, long rating, String placeID, Geometry geometry, ArrayList<Images> images,
                        Description description, DestinationDescriptionShortType destinationDescriptionShortType,
                        DestinationDescriptionLong destinationDescriptionLong, String owner, String category,
                        Opening_hours opening_hours, List<String> primaryTag, long faxNumber, String country, long numRating, long userPoints, String price) {
       this.numRating=numRating;
       this.userPoints = userPoints;
       this.price=price;
        this.officialName = officialName;
        this.localizedPageName = localizedPageName;
        this.completed = completed;
        this.identifier = identifier;
        this.placeID = placeID;
        this.geometry = geometry;
        this.images = images;
        this.rating = rating;
        this.suggested = suggested;
        this.description = description;
        this.destinationDescriptionShortType = destinationDescriptionShortType;
        this.destinationDescriptionLong = destinationDescriptionLong;
        this.owner = owner;
        this.category = category;
        this.opening_hours = opening_hours;
        this.primaryTag = primaryTag;
        this.faxNumber = faxNumber;
        this.country = country;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getLocalizedPageName() {
        return localizedPageName;
    }

    public void setLocalizedPageName(String localizedPageName) {
        this.localizedPageName = localizedPageName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getPlaceID() {
        return placeID;
    }

    public void setPlaceID(String placeID) {
        this.placeID = placeID;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public ArrayList<Images> getImages() {
        return images;
    }

    public void setImages(ArrayList<Images> images) {
        this.images = images;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }





    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public DestinationDescriptionShortType getDestinationDescriptionShortType() {
        return destinationDescriptionShortType;
    }

    public void setDestinationDescriptionShortType(DestinationDescriptionShortType destinationDescriptionShortType) {
        this.destinationDescriptionShortType = destinationDescriptionShortType;
    }

    public DestinationDescriptionLong getDestinationDescriptionLong() {
        return destinationDescriptionLong;
    }

    public void setDestinationDescriptionLong(DestinationDescriptionLong destinationDescriptionLong) {
        this.destinationDescriptionLong = destinationDescriptionLong;
    }
    public boolean isSuggested() {
        return suggested;
    }

    public void setSuggested(boolean suggested) {
        this.suggested = suggested;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Opening_hours getOpening_hours() {
        return opening_hours;
    }

    public void setOpening_hours(Opening_hours opening_hours) {
        this.opening_hours = opening_hours;
    }

    public List<String> getPrimaryTag() {
        return primaryTag;
    }

    public void setPrimaryTag(List<String> primaryTag) {
        this.primaryTag = primaryTag;
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(int faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getNumRating() {
        return numRating;
    }

    public void setNumRating(int numRating) {
        this.numRating = numRating;
    }

    public long getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(long userPoints) {
        this.userPoints = userPoints;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Destinations{" +
                "officialName='" + officialName + '\'' +
                ", localizedPageName='" + localizedPageName + '\'' +
                ", completed=" + completed +
                ", identifier='" + identifier + '\'' +
                ", placeID='" + placeID + '\'' +
                ", geometry=" + geometry +
                ", images=" + images +
                ", suggested=" + suggested +
                ", description=" + description +
                ", destinationDescriptionShortType=" + destinationDescriptionShortType +
                ", destinationDescriptionLong=" + destinationDescriptionLong +
                ", owner='" + owner + '\'' +
                ", category='" + category + '\'' +
                ", opening_hours=" + opening_hours +
                ", primaryTag=" + primaryTag +
                ", faxNumber=" + faxNumber +
                ", country='" + country + '\'' +
                ", rating=" + rating +
                ", numRating=" + numRating +
                ", userPoints=" + userPoints +
                ", price='" + price + '\'' +
                '}';
    }
}