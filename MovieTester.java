package movie;

import java.util.Scanner;

public class MovieTester {

	 
	public static void main(String[] args) //main() 
	{ 
	 
	//Single scanner is enough to getting three inputs 
	//for better understanding three scanner classes are used 
	Scanner inputTitle = new Scanner(System.in); 
	Scanner inputGenre = new Scanner(System.in); 
	Scanner inputRating = new Scanner(System.in); 
	 
	//List <Movie> movieList = new ArrayList<Movie>( );///creation and declaration of studentList array list of  Student 
	Movie[] movieList = new Movie[3]; 
	 
	// the below  for loop is used for receving the input from the user  
	for (int i=0;i < 3 ;i++) 
	{ 
	movieList[i]= new Movie ();//new initailiation  of new instance variable   
	  
	System.out.print(" Please enter the title of movie " + (i+1) + ":"); 
	movieList[i].setTitle(inputTitle.nextLine());//receives input from user and assigns using setter 
	 
	System.out.print(" Please enter the genre of movie " + (i+1) + ":"); 
	movieList[i].setGenre(inputGenre.nextLine());//receives input from user and assigns using setter 
	 
	System.out.print(" Please enter the rating (1-5) " + (i+1) + ":"); 
	movieList[i].setRating(inputRating.nextInt());//receives input from user and assigns using setter 
	} 
	 
	int counter=1; 
	// the below enhanced for loop is used for printing for data in the desired format  
	for (Movie item:movieList) 
	{ 
	  
	System.out.println("Movie " + counter +  "  Title:  " + item.getTitle() ); 
	System.out.println("Movie " + counter +  "  Genre:  " + item.getGenre() ); 
	System.out.println("Movie " + counter +  " Rating:  " + item.getRating() ); 
	item.playIt(); 
	counter++; 
	} 
	 
	//closing of scanners 
	inputGenre.close(); 
	inputRating.close(); 
	inputTitle.close(); 
	 
	}//end of main method 
	 
	 
	}//of end of movie tester class

/* Please enter the title of movie 1:Step Brother
Please enter the genre of movie 1:Comedy
Please enter the rating (1-5) 1: 4
Please enter the title of movie 2: The Big Lebowski
Please enter the genre of movie 2: Crime Comedy
Please enter the rating (1-5) 2:5
Please enter the title of movie 3:O Brother, Where Art THou?
Please enter the genre of movie 3:4
Please enter the rating (1-5) 3:4 */