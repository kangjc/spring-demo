package com.shiguang.pojo;

public class HelloSpring {

    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "Hello{"+"str='"+string+"'}";
    }
}
