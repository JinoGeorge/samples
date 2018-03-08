package com.samples.spring.eventlistener;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class ContextRefreshedEventListener {

    private static final Logger logger = LogManager.getLogger(ContextRefreshedEventListener.class);

    @EventListener
    void onContextRefreshedEvent(ContextRefreshedEvent event) {
        logger.debug("debugging event listener");
        logger.info("debugging event listener");
    }
}
