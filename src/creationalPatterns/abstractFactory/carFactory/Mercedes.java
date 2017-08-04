package creationalPatterns.abstractFactory.carFactory;

public class Mercedes implements Car{
	final String name = "Mercedes";

		
	static {  CarFactory.registerCar("MERCEDES",new Mercedes()); }
	
	public Mercedes(){
		System.out.println("Factory Generating Mercedes Car");
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
