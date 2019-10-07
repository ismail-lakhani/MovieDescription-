package movie;

public class Movie {
  
	private String title; 
	private String genre; 
	private int rating; 
	 
	 
	// Default constructor is created ,if not java will create a default one  
	public Movie() { 
	this.title="undefined"; 
	this.genre="undefined"; 
	this.rating=0; 
	} 
	 
	// Another constructor is created with overloading of constructor  
	public Movie(String title, String genre ,int rating){ 
	this.title="title"; 
	this.genre="genre"; 
	this.rating=rating; 
	} 
	 
	 
	public String getTitle() { 
	return title; 
	} 
	public void setTitle(String title) { 
	this.title = title; 
	} 
	public String getGenre() { 
	return genre; 
	} 
	public void setGenre(String genre) { 
	this.genre = genre; 
	} 
	public int getRating() { 
	return rating; 
	} 
	public void setRating(int rating) { 
	this.rating = rating; 
	} 
	public void playIt() { 
	System.out.println(getTitle()+" -Now Playing "); 
	 
	} 
	@Override 
	public String toString() { 
	return "Movie [title=" + title + ", genre=" + genre + ", rating=" + rating + ", getTitle()=" + getTitle() 
	+ ", getGenre()=" + getGenre() + ", getRating()=" + getRating() + "]"; 
	} 
	} 

	 
	 

