package creationalPatterns.colorFactoryPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.carFactoryPattern.Car;

public class ColorFactory extends AbstractFactory {

	private static HashMap<String,Color> m_RegisteredColors = new HashMap<String,Color>();
	
	
	public static void registerColor (String colorID, Color carClass)
	{
		m_RegisteredColors.put(colorID, carClass);
	}
	
	@Override
	public Color createColor(String colorID)
	{
		return m_RegisteredColors.get(colorID).createColor();	
		
	}

	@Override
	public Car createCar(String carID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
