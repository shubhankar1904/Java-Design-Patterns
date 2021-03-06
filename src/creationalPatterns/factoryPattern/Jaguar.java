package creationalPatterns.factoryPattern;

public class Jaguar extends Car{
	final String name = "Jaguar";
	
	
	static {  CarFactory.registerCar("JAGUAR",new Jaguar()); }
	public Jaguar(){
		System.out.println("Factory Generating Jaguar Car");
	}
	
	@Override
	public void run() {
		
		System.out.println("Moving "+this.name);
		
	}
	
	@Override
	public Car createCar()	{
		return this;
	}
	
}
