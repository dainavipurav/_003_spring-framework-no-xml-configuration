package com.abc.learning.modules.bus;

import org.springframework.beans.factory.annotation.Value;

import com.abc.learning.interfaces.Introduction;

public class BusIntroduction implements Introduction {
	
	@Value("${bus.image}")
	private String image;

	@Value("${bus.intro}")
	private String intro;

	@Override
	public String image() {
		return image;
	}

	@Override
	public String intro() {
		return intro;
	}

}
