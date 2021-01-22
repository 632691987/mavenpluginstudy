package com.vincent.maven_source_plugin.service;

import org.junit.Assert;
import org.junit.Test;

public class SampleServiceTest {

    private SampleService sampleService = new SampleService();

    @Test
    public void testSampleServiceStringConcat() {
        String value1 = "mockString1";
        String value2 = "mockString2";

        String expectedValue = value1.concat("_").concat(value2);
        Assert.assertTrue(sampleService.sampleServiceStringConcat(value1, value2).equalsIgnoreCase(expectedValue));
    }

    @Test
    public void testSampleServiceGetLength() {
        String value = "1234567890";
        int length = value.length();
        Assert.assertEquals(length,sampleService.sampleServiceGetLength(value));
    }

    @Test
    public void testSampleServiceCheckValue_Success() {
        String value = "1234567890";
        int length = value.length();
        Assert.assertEquals(length,sampleService.sampleServiceCheckValue(value));
    }

    @Test(expected=RuntimeException.class)
    public void testSampleServiceCheckValue_Failure() {
        String value = "error";
        sampleService.sampleServiceCheckValue(value);
    }



}
