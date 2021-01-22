package com.vincent.exec_maven_plugin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExecMavenPluginApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SampleService sampleService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("=========================================================");
        logger.info("=========================================================");
        logger.info("=========================================================");
        if(args.length>0) {
            for(int index = 0 ; index < args.length ; index ++) {
                logger.info(args[index]);
            }
        }
        logger.info("=========================================================");
        logger.info("=========================================================");
        logger.info("=========================================================");
    }

    public static void main(String[] args) {
        SpringApplication.run(ExecMavenPluginApplication.class, args);
    }
}
