package creationalPatterns.carFactoryPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.colorFactoryPattern.Color;

public class CarFactory extends AbstractFactory{

	private static HashMap<String,Car> m_RegisteredCars = new HashMap<String,Car>();
	
	
	public static void registerCar (String carID, Car carClass)
	{
		m_RegisteredCars.put(carID, carClass);
	}
	
	public Car createCar(String carID) 
	{
		return m_RegisteredCars.get(carID).createCar();	
		
	}



	@Override
	public Color createColor(String colorID) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
