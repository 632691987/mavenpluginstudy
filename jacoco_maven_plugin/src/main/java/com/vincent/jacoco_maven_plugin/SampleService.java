package com.vincent.jacoco_maven_plugin;

import org.springframework.stereotype.Component;

@Component
public class SampleService {

    public String sampleServiceStringConcat(String value1, String value2) {
        return value1.concat("_").concat(value2);
    }

    public int sampleServiceGetLength(String value) {
        return value.length();
    }

    public int sampleServiceCheckValue(String value) {

        if(value.equalsIgnoreCase("error")) {
            throw new RuntimeException("system error");
        }

        return value.length();

    }

}
