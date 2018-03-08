package com.samples.spring;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        logger.info( "Starting application with Log4j..." );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        logger.info("Application {} started at {}", context.getApplicationName(), context.getStartupDate());
    }
}
