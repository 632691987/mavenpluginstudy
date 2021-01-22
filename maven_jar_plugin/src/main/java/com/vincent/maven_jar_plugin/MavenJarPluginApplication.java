package com.vincent.maven_jar_plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenJarPluginApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SampleService sampleService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("===============================================================");
        logger.info(sampleService.sampleServiceStringConcat("value1", "value2"));
        logger.info("===============================================================");
    }

    public static void main(String[] args) {
        SpringApplication.run(MavenJarPluginApplication.class, args);
    }
}
