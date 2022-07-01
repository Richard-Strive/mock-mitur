package com.example.demo;

import java.util.List;

public class Results {

    private String resultsPerPage;
    private int total;
    private int pages;
    private List<Destinations> cmsDestination;

    private String status;

    public Results(String resultsPerPage, int total, int pages, List<Destinations> cmsDestination, String status) {
        this.resultsPerPage = resultsPerPage;
        this.total = total;
        this.pages = pages;
        this.cmsDestination = cmsDestination;
        this.status = status;
    }

    public String getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(String resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<Destinations> getCmsDestination() {
        return cmsDestination;
    }

    public void setCmsDestination(List<Destinations> cmsDestination) {
        this.cmsDestination = cmsDestination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Results{" +
                "resultsPerPage='" + resultsPerPage + '\'' +
                ", total=" + total +
                ", pages=" + pages +
                ", cmsDestination=" + cmsDestination +
                ", status='" + status + '\'' +
                '}';
    }

}