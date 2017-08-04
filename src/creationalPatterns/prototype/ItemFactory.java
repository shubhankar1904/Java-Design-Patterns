package creationalPatterns.prototype;
public class ItemFactory {  
	
	Item item;
	
	public Item loadCd(){	
		item = new CD(); //A time consuming task
		return item;
	}
	
	public Item generate(Item item){
		return item.duplicate();
	}
	
}

