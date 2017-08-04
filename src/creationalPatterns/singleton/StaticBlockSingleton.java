package creationalPatterns.singleton;

public class StaticBlockSingleton {
private static final StaticBlockSingleton INSTANCE;

	static { 
		try {
			 INSTANCE = new StaticBlockSingleton();	
		 } catch (Exception e) { 
			throw new RuntimeException("An error occurred!", e);
		 } 
	} 

	
	private StaticBlockSingleton() {} 
	
	public static StaticBlockSingleton getInstance() { return INSTANCE; }
	
	public void printMessage(){
		System.out.println("Inside Singleton function. Singleton Instance: "+this.hashCode());
	}
}
