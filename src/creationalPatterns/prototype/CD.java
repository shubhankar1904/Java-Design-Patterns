package creationalPatterns.prototype;

import java.util.Date;

public class CD implements Item{

	
	String name;
	int id;
	String artist;
	String album;

	
	public CD() {
		//Some Database connection or time consuming file read gets the data and creates an object. 
		//Lets hardcode the values for simplicity
		this.name = "Seventh Son of a seventh son";
		this.artist = "Iron Maiden";
		this.album = "Seventh Son of a seventh son";
		this.id = 1;
		try {
			Thread.sleep(5000);  // to simulate the time consuming nature of the constructor
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public CD(String name, int id, String artist, String album) {
		super();
		this.name = name;
		this.id = id;
		this.artist = artist;
		this.album = album;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public Item duplicate() {
		return new CD(this.name, this.id, this.artist, this.album);
	}



	@Override
	public String toString() {
		return "CD [name=" + name + ", id=" + id + ", artist=" + artist + ", album=" + album + "]";
	} 
		

	}