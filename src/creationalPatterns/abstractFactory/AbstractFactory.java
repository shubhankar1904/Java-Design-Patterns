package creationalPatterns.abstractFactory;

import creationalPatterns.carFactoryPattern.Car;
import creationalPatterns.colorFactoryPattern.Color;

public abstract class AbstractFactory {
	
	public abstract Car createCar(String carID);
	public abstract Color createColor(String colorID);
}
