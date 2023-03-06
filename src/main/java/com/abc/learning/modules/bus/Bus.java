package com.abc.learning.modules.bus;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.abc.learning.interfaces.GovtRecognition;
import com.abc.learning.interfaces.Introduction;
import com.abc.learning.interfaces.Vehicle;

public class Bus implements Vehicle
{
	@Value("${bus.name}")
	private String name;
	
	@Value("${bus.type}")
	private String type;
	
	@Value("${bus.color}")
	private String color;
	
	@Value("${bus.gearCount}")
	private int gearCount;
	
	@Value("${bus.seatCount}")
	private int seatCount;
	
	@Autowired
	@Qualifier("busIntroduction")
	private Introduction introduction;
	
	@Autowired
	@Qualifier("busGovtRecognition")
	private GovtRecognition govtRecognition;

	@Override
	public String name() {
		return name;
	}

	@Override
	public String type() {
		return type;
	}

	@Override
	public String color() {
		return color;
	}

	@Override
	public int seatCount() {
		return seatCount;
	}

	@Override
	public int gearCount() {
		return gearCount;
	}

	@Override
	@PostConstruct
	public void display() {
		System.out.println("*** Vehicle Details ***");
		System.out.println("Vehicle Name : " + name);
		System.out.println("Vehicle Type : " + type);
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Gear : " + gearCount);
		System.out.println("Vehicle No. Of Seats : " + seatCount);
		System.out.println("Vehicle Image : " + introduction.image());
		System.out.println("Vehicle Intro : " + introduction.intro());
		System.out.println("Vehicle Govt Recognized : " + govtRecognition.isGovtRecognized());
		System.out.println();
	}

	@Override
	@PreDestroy ///This method will not execute because the bean has prototype scope and for beans having prototype scope down't have destroy method
	public void destroy() {
		System.out.println("Destroying Bus Bean...");
	}

}