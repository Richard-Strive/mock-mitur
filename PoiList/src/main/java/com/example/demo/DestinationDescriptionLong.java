package com.example.demo;

public class DestinationDescriptionLong {
    private String html;

    public DestinationDescriptionLong(String html) {
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
