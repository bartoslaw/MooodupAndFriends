package com.mooduplabs.taigaopensource.models;

public class Parameters {
    String key;
    String value;

    public Parameters() {
    }

    public Parameters(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
