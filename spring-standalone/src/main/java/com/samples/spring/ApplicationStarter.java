package com.samples.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.CommandLinePropertySource;
import org.springframework.core.env.SimpleCommandLinePropertySource;

/**
 * Spring application starter.
 */
public class ApplicationStarter {

    public static void main(String[] args) {
        CommandLinePropertySource commandLine = new SimpleCommandLinePropertySource(args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().getPropertySources().addFirst(commandLine);
        context.register(ApplicationConfig.class);
        context.refresh();
    }
}
