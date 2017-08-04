package creationalPatterns.singleton;

public class DoubleCheckLockingThreadSafeSingleton {
	private static volatile DoubleCheckLockingThreadSafeSingleton instance = null; 

	public static DoubleCheckLockingThreadSafeSingleton getInstance() { 
		if (instance == null) { 
			synchronized (DoubleCheckLockingThreadSafeSingleton .class)
			{ 
				if (instance == null) 
				{
					instance = new DoubleCheckLockingThreadSafeSingleton (); 
				}
			}
		} 
	return instance; 
	}	

	private DoubleCheckLockingThreadSafeSingleton(){}
	
	public void printMessage(){
		System.out.println("Inside Singleton function. Singleton Instance: "+this.hashCode());
	}
	
	
}

