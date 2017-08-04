package creationalPatterns.singleton;

public class ThreadSafeLazySingleton {
	private static ThreadSafeLazySingleton INSTANCE = null;

	public static synchronized ThreadSafeLazySingleton getInstance() { 
		if (INSTANCE == null) { 
			INSTANCE = new ThreadSafeLazySingleton (); 
		} 
	return INSTANCE; 
	}	

	private ThreadSafeLazySingleton() {} 
	
	
	public void printMessage(){
		System.out.println("Inside Singleton function. Singleton Instance: "+this.hashCode());
	}
}
