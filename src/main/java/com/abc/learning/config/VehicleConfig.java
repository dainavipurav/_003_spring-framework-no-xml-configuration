package com.abc.learning.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.abc.learning.interfaces.GovtRecognition;
import com.abc.learning.interfaces.Introduction;
import com.abc.learning.interfaces.Vehicle;
import com.abc.learning.modules.bus.Bus;
import com.abc.learning.modules.bus.BusGovtRecognition;
import com.abc.learning.modules.bus.BusIntroduction;
import com.abc.learning.modules.car.Car;
import com.abc.learning.modules.car.CarGovtRecognition;
import com.abc.learning.modules.car.CarIntroduction;

@Configuration
@PropertySource("classpath:spring.properties")
public class VehicleConfig {
	
	@Bean
	@Scope("singleton")
	public Vehicle car() {
		return new Car();
	}
	
	@Bean
	public Introduction carIntroduction() {
		return new CarIntroduction();
	}
	
	@Bean
	public GovtRecognition carGovtRecognition() {
		return new CarGovtRecognition();
	}
	
	@Bean
	@Scope("prototype")
	public Vehicle bus() {
		return new Bus();
	}
	
	@Bean
	public Introduction busIntroduction() {
		return new BusIntroduction();
	}
	
	@Bean
	public GovtRecognition busGovtRecognition() {
		return new BusGovtRecognition();
	}
	
}
