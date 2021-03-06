package com.samples.spring.eventlistener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class ContextRefreshedEventListener {

    private static Logger logger = LoggerFactory.getLogger(ContextRefreshedEventListener.class);

    @EventListener
    private void onContextStartEvent(ContextRefreshedEvent event) {
        logger.info("Application refreshed at : " + event.getTimestamp());
    }
}
