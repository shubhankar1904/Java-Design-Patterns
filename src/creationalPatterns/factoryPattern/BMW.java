package creationalPatterns.factoryPattern;

public class BMW extends Car{

	final String name = "BMW";
	
	static {  CarFactory.registerCar("BMW",new BMW()); }
	public BMW(){
		System.out.println("Factory Generating BMW Car");
	}
	
	@Override
	public void run() {
		System.out.println("Moving "+this.name);
		
	}
	
	@Override
	public Car createCar()	{
		return new BMW();	
	}

}
