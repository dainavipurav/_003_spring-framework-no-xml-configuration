package com.abc.learning.modules.car;

import org.springframework.beans.factory.annotation.Value;

import com.abc.learning.interfaces.GovtRecognition;

public class CarGovtRecognition implements GovtRecognition {
	
	@Value("${car.isGovtRecognized}")
	private boolean isGovtRecognized;

	@Override
	public boolean isGovtRecognized() {
		return isGovtRecognized;
	}

}
