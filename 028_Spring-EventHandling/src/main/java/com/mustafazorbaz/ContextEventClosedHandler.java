package com.mustafazorbaz;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextEventClosedHandler implements ApplicationListener<ContextClosedEvent> {

	 
	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("Context olay sonlandırma...");
	}

}

