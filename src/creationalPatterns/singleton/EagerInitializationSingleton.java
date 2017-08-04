package creationalPatterns.singleton;

public class EagerInitializationSingleton {

	private static final EagerInitializationSingleton INSTANCE = new EagerInitializationSingleton(); 
	
	private EagerInitializationSingleton() {} 
	
	public static EagerInitializationSingleton getInstance() { return INSTANCE; }
	
	public void printMessage(){
		System.out.println("Inside Singleton function. Singleton Instance: "+this.hashCode());
	}
}
