package com.volkanozsay.jenkins;

import org.springframework.stereotype.Component;

@Component
public class Deneme {
    private String dneme;

    public String getDneme() {
        return dneme;
    }

    public void setDneme(String dneme) {
        this.dneme = dneme;
    }
}
