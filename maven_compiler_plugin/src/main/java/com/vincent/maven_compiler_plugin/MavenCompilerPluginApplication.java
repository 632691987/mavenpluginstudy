package com.vincent.maven_compiler_plugin;

import com.vincent.maven_compiler_plugin.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MavenCompilerPluginApplication implements CommandLineRunner {

    @Autowired
    private SampleService sampleService;

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(sampleService.sampleServiceStringConcat("value1", "value2"));
    }

    public static void main(String[] args) {
        SpringApplication.run(MavenCompilerPluginApplication.class, args);
    }
}
