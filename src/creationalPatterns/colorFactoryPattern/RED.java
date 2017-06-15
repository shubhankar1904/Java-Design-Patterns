package creationalPatterns.colorFactoryPattern;

public class RED implements Color{

	final String name = "RED";
	
	static {  ColorFactory.registerColor("RED",new RED()); }
	public RED(){
		System.out.println("Factory Generating Red color");
	}
	
	@Override
	public void paint() {
		System.out.println("Painting car "+this.name);
		
	}
	
	@Override
	public Color createColor()	{
		return this;	
	}

}
