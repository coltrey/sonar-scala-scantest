package com.coltrey.javacore;

import java.io.Serializable;

public class JavaObject implements Serializable {

    private Long longData;
    private String stringData;
    private boolean isLong;

    public JavaObject(String data) {
        this.stringData = data;
        this.isLong = false;
    }

    public JavaObject(Long data) {
        this.longData = data;
        this.isLong = true;
    }

    public JavaObject(Integer data) {
        this.isLong = true;
        this.longData = data.longValue();
    }

    public boolean isLong() { return isLong; }

    public Long getLongData() { return longData; }

    public String getStringData() { return stringData; }
}
