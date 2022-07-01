package com.example.demo;

public class DestinationDescriptionShortType {
    private String html;

    public DestinationDescriptionShortType(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public String toString() {
        return "Description{" +
                "html='" + html + '\'' +
                '}';
    }
}
