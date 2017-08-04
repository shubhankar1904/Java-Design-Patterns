package creationalPatterns.singleton;

public class BillPughSingleton {
	private static class BillPughSingletonHolder { 
		public static final BillPughSingleton INSTANCE = new BillPughSingleton();
		
	} 
	public static BillPughSingleton getInstance() { 
		return BillPughSingletonHolder.INSTANCE;
	}
	
	public void printMessage(){
		System.out.println("Inside Singleton function. Singleton Instance: "+this.hashCode());
	}
}
