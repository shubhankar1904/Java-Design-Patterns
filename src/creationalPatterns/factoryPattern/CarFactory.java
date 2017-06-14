package creationalPatterns.factoryPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class CarFactory {

	private static HashMap<String,Car> m_RegisteredCars = new HashMap<String,Car>();
	
	
	public static void registerCar (String carID, Car carClass)
	{
		m_RegisteredCars.put(carID, carClass);
	}
	
	public Car createCar(String carID) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		return m_RegisteredCars.get(carID).createCar();	
		
	}
	
	
}
