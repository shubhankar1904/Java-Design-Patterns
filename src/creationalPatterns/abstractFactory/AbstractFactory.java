package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.carFactory.Car;
import creationalPatterns.abstractFactory.colorFactory.Color;

public abstract class AbstractFactory {
	
	public abstract Car createCar(String carID);
	public abstract Color createColor(String colorID);
}
