import java.io.*;
import java.util.Scanner;


//Finds a list of words in a text taken from a file and counts their occurrence. 

//I need to create some GUI.

public class TextAnalysis {

	public static void main(String[] args) throws IOException {
		File file = new File("input.txt");//The file with the text where we are going to look.
		File list = new File("list.txt");//List of words we are looking for.
		
		readUsingScanner(file, list);

	}

	//Method to read and compare Text Files
	
    private static void readUsingScanner(File file, File list) throws IOException {
    	
    	Scanner compare = new Scanner(list); //List of words we are looking for.
    	    int count = 0; //The count for each word.
    	    System.out.println("Frecuencia: ");
    	    
    	    while (compare.hasNext()) { //Loop for the list of words we're looking for.
    	    	
    	    	Scanner input = new Scanner(file);//The text where we're going to look.
    	    	String wordToCompare  = compare.next().toLowerCase(); //Word we're looking for.
    	    	
    	    	while (input.hasNext()) { //Loop for the text where we are looking.
    	    		//Looking word by word in the text.
    	    		String wordInput = input.next().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); //This puts the word in lower case and eliminates all periods and commas.
    	    		
    	    		if(wordToCompare.equals(wordInput)) {//If we find a match, add to the count.
    	    			count++;
    	    		}
    	    	}
    	    	System.out.println(wordToCompare + ": " + count); //Prints the word looked for plus its count in the text.
    	    	count = 0; //Resets the count for a new word.
    	    	
    	    }
    }
    
}
