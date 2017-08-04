package creationalPatterns.singleton;

public class LazySingleton {

	private static LazySingleton INSTANCE = null;

	public static LazySingleton getInstance() { 
		if (INSTANCE == null) { 
			INSTANCE = new LazySingleton (); 
		} 
	return INSTANCE; 
	}	

	private LazySingleton() {} 
	
	
	public void printMessage(){
		System.out.println("Inside Singleton function. Singleton Instance: "+this.hashCode());
	}
}
