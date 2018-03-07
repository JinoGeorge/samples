package com.samples.spring.eventlistener;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
class ContextRefreshedEventListener {

    @EventListener
    private void onContextStartEvent(ContextRefreshedEvent event) {
        System.out.println("Application refreshed at : " + event.getTimestamp());
    }
}
