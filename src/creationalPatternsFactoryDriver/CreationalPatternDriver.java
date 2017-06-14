package creationalPatternsFactoryDriver;

import java.lang.reflect.InvocationTargetException;

import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactory.FactoryProducer;
import creationalPatterns.carFactoryPattern.Car;
import creationalPatterns.carFactoryPattern.CarFactory;
import creationalPatterns.colorFactoryPattern.Color;

public class CreationalPatternDriver {


	static{
		try{
			Class.forName("creationalPatterns.carFactoryPattern.BMW");
			Class.forName("creationalPatterns.carFactoryPattern.Jaguar");
			Class.forName("creationalPatterns.carFactoryPattern.Mercedes");
			Class.forName("creationalPatterns.colorFactoryPattern.RED");
			Class.forName("creationalPatterns.colorFactoryPattern.GREEN");
			Class.forName("creationalPatterns.colorFactoryPattern.BLUE");
			}		
		catch (ClassNotFoundException any)
		{
			any.printStackTrace();
			
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		

		FactoryProducer factory = new FactoryProducer();
		AbstractFactory carFactory = factory.getFactory("CAR");
		Car car1 = carFactory.createCar("BMW");
		Car car2 = carFactory.createCar("JAGUAR");
		Car car3 = carFactory.createCar("MERCEDES");
		
		AbstractFactory colorFactory = factory.getFactory("COLOR");
		Color color1 = colorFactory.createColor("RED");
		Color color2 = colorFactory.createColor("BLUE");
		Color color3 = colorFactory.createColor("GREEN");
		
	
		
		System.out.println("\n");
		
		car1.run();
		color1.paint();
		car2.run();
		color2.paint();
		car3.run();
		color3.paint();
	
	}

}
