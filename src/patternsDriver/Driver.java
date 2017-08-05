package patternsDriver;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import creationalPatterns.Builder.Meal;
import creationalPatterns.Builder.MealBuilder;
import creationalPatterns.abstractFactory.AbstractFactory;
import creationalPatterns.abstractFactory.FactoryProducer;
import creationalPatterns.abstractFactory.carFactory.Car;
import creationalPatterns.abstractFactory.colorFactory.Color;
import creationalPatterns.prototype.Item;
import creationalPatterns.prototype.ItemFactory;
import creationalPatterns.singleton.BillPughSingleton;
import creationalPatterns.singleton.DoubleCheckLockingThreadSafeSingleton;
import creationalPatterns.singleton.EagerInitializationSingleton;
import creationalPatterns.singleton.EnumSingleton;
import creationalPatterns.singleton.LazySingleton;
import creationalPatterns.singleton.StaticBlockSingleton;
import creationalPatterns.singleton.ThreadSafeLazySingleton;


public class Driver {

	
	public static void factoryPattern() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException{
		
		//to register classes by loading and executing their static content
		Class.forName("creationalPatterns.factoryPattern.BMW");
		Class.forName("creationalPatterns.factoryPattern.Jaguar");
		Class.forName("creationalPatterns.factoryPattern.Mercedes");
		
		 creationalPatterns.factoryPattern.CarFactory carFactory;
		 carFactory = new   creationalPatterns.factoryPattern.CarFactory();
		 carFactory.createCar("BMW").run();
		 carFactory.createCar("MERCEDES").run();
		 carFactory.createCar("JAGUAR").run();
		 
		
		
	}
	
	public static void abstractFactoryPattern() throws ClassNotFoundException{
		//to register classes by loading and executing their static content
		Class.forName("creationalPatterns.carFactoryPattern.BMW");
		Class.forName("creationalPatterns.carFactoryPattern.Jaguar");
		Class.forName("creationalPatterns.carFactoryPattern.Mercedes");
		
		Class.forName("creationalPatterns.colorFactoryPattern.GREEN");
		Class.forName("creationalPatterns.colorFactoryPattern.BLUE");
		Class.forName("creationalPatterns.colorFactoryPattern.RED");
		
		
		
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

	public static void eagerInitializationSingleton(){
		//This is an invalid statement since constructor is private;
		//EagerInitializationSingleton singleton = new EagerInitializationSingleton();
		
		EagerInitializationSingleton singleton = EagerInitializationSingleton.getInstance();
		singleton.printMessage();
		EagerInitializationSingleton singleton2 = EagerInitializationSingleton.getInstance();
		singleton2.printMessage();
		
		//Singleton1 and singleton2 refers to the same object;
	}
	
	public static void staticBlockSingleton(){
		
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
		singleton.printMessage();
		StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();
		singleton2.printMessage();
		
		//Singleton1 and singleton2 refers to the same object;
	}

	public static void lazySingleton(){

			
			LazySingleton singleton = LazySingleton.getInstance();
			singleton.printMessage();
			LazySingleton singleton2 = LazySingleton.getInstance();
			singleton2.printMessage();
			
			//Singleton1 and singleton2 refers to the same object;
		}

	public static void threadSafLazySingleton(){
		
		ThreadSafeLazySingleton singleton = ThreadSafeLazySingleton.getInstance();
		singleton.printMessage();
		ThreadSafeLazySingleton singleton2 = ThreadSafeLazySingleton.getInstance();
		singleton2.printMessage();
		
		//Singleton1 and singleton2 refers to the same object;
	}
	
	public static void doubleCheckLockingThreadSafeSingleton(){
		
		DoubleCheckLockingThreadSafeSingleton singleton = DoubleCheckLockingThreadSafeSingleton.getInstance();
		singleton.printMessage();
		DoubleCheckLockingThreadSafeSingleton singleton2 = DoubleCheckLockingThreadSafeSingleton.getInstance();
		singleton2.printMessage();
		
		//Singleton1 and singleton2 refers to the same object;
	}
	
	public static void billPughSingleton(){
		
		BillPughSingleton singleton = BillPughSingleton.getInstance();
		singleton.printMessage();
		BillPughSingleton singleton2 = BillPughSingleton.getInstance();
		singleton2.printMessage();
		
		//Singleton1 and singleton2 refers to the same object;
	}

	public static void destroySingleton(){
		EagerInitializationSingleton instanceOne = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instanceTwo = null;
		try {
				Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
				for (Constructor constructor : constructors) {
					//Below code will destroy the singleton pattern
					constructor.setAccessible(true);
					instanceTwo = (EagerInitializationSingleton) constructor.newInstance();
					break;
				}
			} catch (Exception e) {
					e.printStackTrace();
					}
		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

	public static void enumSingleton(){
		
		EnumSingleton.Instance.printMessage();
		EnumSingleton.Instance.printMessage();
		
	}
	
	public static void prototypePattern(){
		ItemFactory itemFactory = new ItemFactory();
		System.out.println("Creating CD Object");
		Item item = itemFactory.loadCd();
		System.out.println("Created object");
		System.out.println("Creating Clone");
		
		Item item2 = itemFactory.generate(item);
		System.out.println("Created");
		System.out.println(item2.toString());
	}
	
	public static void builderPattern(){
		 MealBuilder mealBuilder = new MealBuilder();

	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " + vegMeal.getCost());

	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}

