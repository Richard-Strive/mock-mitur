package com.example.demo;

public class Description {
    private String plain_text;

    public Description(String plain_text) {
        this.plain_text = plain_text;
    }

    public String getplain_text() {
        return plain_text;
    }

    public void setplain_text(String plain_text) {
        this.plain_text = plain_text;
    }

    @Override
    public String toString() {
        return "Description{" +
                "plain_text='" + plain_text + '\'' +
                '}';
    }
}
