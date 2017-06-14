package creationalPatterns.colorFactoryPattern;

public class BLUE implements Color{
	final String name = "BLUE";
	
	
	static {  ColorFactory.registerColor("BLUE",new BLUE()); }
	public BLUE(){
		System.out.println("Factory Generating Jaguar Car");
	}
	
	@Override
	public void paint() {
		
		System.out.println("Painting car "+this.name);
		
	}
	
	@Override
	public Color createColor()	{
		return new BLUE();	
	}
	
}
