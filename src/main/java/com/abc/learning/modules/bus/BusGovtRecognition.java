package com.abc.learning.modules.bus;

import org.springframework.beans.factory.annotation.Value;

import com.abc.learning.interfaces.GovtRecognition;

public class BusGovtRecognition implements GovtRecognition {

	@Value("${bus.isGovtRecognized}")
	private boolean isGovtRecognized;

	@Override
	public boolean isGovtRecognized() {
		return isGovtRecognized;
	}

}
