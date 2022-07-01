package com.example.demo;

public class Opening_hours {
    private String html;

    public Opening_hours(String html) {
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
