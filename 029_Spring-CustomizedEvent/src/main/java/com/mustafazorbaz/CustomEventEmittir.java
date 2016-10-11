package com.mustafazorbaz;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventEmittir implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;	@Override
	
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
       this.applicationEventPublisher=applicationEventPublisher;		
	}
	public void kontrolYap(int gelenId)
	{
		CustomEvent customEvent=new CustomEvent(gelenId);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
