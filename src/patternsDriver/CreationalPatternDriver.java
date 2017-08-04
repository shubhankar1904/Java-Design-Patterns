package patternsDriver;

import java.lang.reflect.InvocationTargetException;

import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactory.FactoryProducer;
import creationalPatterns.abstractFactory.carFactory.Car;
import creationalPatterns.abstractFactory.carFactory.CarFactory;
import creationalPatterns.abstractFactory.colorFactory.Color;

public class CreationalPatternDriver {


	
	//The static block mentioned in my blog: techgimmick.wordpress.com,
	//have been moved to their respective functions in Driver class
	
	
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException {
		
		
		//Driver.factoryPattern();
		//Driver.abstractFactoryPattern();
		
		/*****************Singleton Pattens *****************/
		
		//Driver.eagerInitializationSingleton();
		//Driver.staticBlockSingleton();
		//Driver.lazySingleton();
		//Driver.threadSafLazySingleton();
		//Driver.doubleCheckLockingThreadSafeSingleton();
		//Driver.billPughSingleton();
		//Driver.destroySingleton();	
		//Driver.enumSingleton();
	
		/*****************Prototype Pattern*****************/
		
		//Driver.prototypePattern();
		
	
	}

}
