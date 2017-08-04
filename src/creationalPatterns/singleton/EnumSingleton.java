package creationalPatterns.singleton;

public enum EnumSingleton {
 Instance;
	
	//Constructor called by JVM implicitly, but can also be declared. 
	  /*
	   * private EnumSingleton() {
	        
	    }
	*/
	public void printMessage(){
	 System.out.println("Singleton Instance : "+ Instance.hashCode()); 
 	}
}
