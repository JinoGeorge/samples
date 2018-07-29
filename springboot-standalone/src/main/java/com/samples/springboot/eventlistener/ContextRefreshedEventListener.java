package com.samples.springboot.eventlistener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class ContextRefreshedEventListener {

    private static Log logger = LogFactory.getLog(ContextRefreshedEventListener.class);

    @EventListener
    private void onContextStartEvent(ContextRefreshedEvent event) {
        logger.info("Application refreshed at : " + event.getTimestamp());
    }
}
