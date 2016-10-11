package com.mustafazorbaz;

import org.springframework.context.ApplicationEvent;

public class CustomEvent  extends ApplicationEvent{

	public CustomEvent(Object source) {
		super(source);
		System.out.println(source.toString());
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "CustomOlay [Özeleştirilen olaydır...]";
	}

}
