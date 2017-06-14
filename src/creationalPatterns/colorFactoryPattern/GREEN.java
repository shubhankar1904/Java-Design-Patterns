package creationalPatterns.colorFactoryPattern;

public class GREEN implements Color{
	final String name = "GREEN";

		
	static {  ColorFactory.registerColor("GREEN",new GREEN()); }
	
	public GREEN(){
		System.out.println("Factory Generating Green color");
	}
	
	@Override
	public void paint() {
		
		System.out.println("Painting car "+this.name);
		
	}
	
	@Override
	public Color createColor()	{
		return new GREEN();	
	}

}
