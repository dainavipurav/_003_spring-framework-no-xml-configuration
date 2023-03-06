package com.abc.learning.modules.car;

import org.springframework.beans.factory.annotation.Value;

import com.abc.learning.interfaces.Introduction;

public class CarIntroduction implements Introduction {
	
	@Value("${car.image}")
	private String image;
	
	@Value("${car.intro}")
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
