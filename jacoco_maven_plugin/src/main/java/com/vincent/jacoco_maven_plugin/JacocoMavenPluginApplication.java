package com.vincent.jacoco_maven_plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JacocoMavenPluginApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SampleService sampleService;

    @Override
    public void run(String... args) throws Exception {
        logger.info(sampleService.sampleServiceStringConcat("value1", "value2"));
    }

    public static void main(String[] args) {
        SpringApplication.run(JacocoMavenPluginApplication.class, args);
    }
}
