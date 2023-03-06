package com.abc.learning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.abc.learning.config.VehicleConfig;
import com.abc.learning.interfaces.Vehicle;

public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(VehicleConfig.class);
        
        Vehicle car1 = context.getBean("car",Vehicle.class);
        Vehicle car2 = context.getBean("car",Vehicle.class);
        
        System.out.println("*** Singleton Bean Scope ***");
		System.out.println("car1 : "+car1);
		System.out.println("car2 : "+car2);
		System.out.println("car1 == car2 : "+(car1==car2));
		System.out.println();
		
		Vehicle bus1 = context.getBean("bus",Vehicle.class);
		Vehicle bus2 = context.getBean("bus",Vehicle.class);

		System.out.println("*** Prototype Bean Scope ***");
		System.out.println("bus1 : "+bus1);
		System.out.println("bus2 : "+bus2);
		System.out.println("bus1 == bus2 : "+(bus1==bus2));
		System.out.println();
      
        context.close();
    }
}
