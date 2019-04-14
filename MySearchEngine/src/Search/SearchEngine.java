/* 
 * AlMundhar AlSalmi 
 * D16125575
 * SearchEngine Class
 * 
 */

package Search;

import java.io.BufferedReader;  
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
		

public  class SearchEngine 
{
	
	//constructor
	SearchEngine() throws IOException 
	{
		//scanner to ask for user input
		Scanner txt = new Scanner(System. in);
		System. out. println("Enter a string: ");		
		//scanned text implemented into a variable
		String input = txt.nextLine();
		
		//creating a file descriptor for searching the files
		File f1=new File("file1.txt"); 
		
		//initializing the word array
	    String[] words=null;
	    
	    //creating file reader object
	    FileReader fr = new FileReader(f1);  
	    
	    //creating buffered reader object
	    BufferedReader br = new BufferedReader(fr); 
	    
	    //initializing string for word split 
	    String s;     
	    
	    //initializing counter for word
	    int count=0;
	    
	    
	    
	    //while loop to read content from the files
	    while((s=br.readLine())!=null)
	    {
	    	input = input.toLowerCase();
	    	words=s.split(" ");  //split the word using space
	    	
	    	//for loop for searching the given word
	    	for (String word : words) 
	    	{
	               if (word.equals(input))
	               {
	                 count++; //if word is found increase the count by one
	               }
	        }
	    }
	    
	    
	    //check for count not equal to zero
	    if(count!=0)  
	    {
	    	//if yes, print how many time word is present
	       System.out.println("The word is present "+count+ " Times in the file: " + f1);
	       
	    }
	    else
	    {
	    	//if no, print word not found
	       System.out.println("Word not found");
	    }
	    
	       fr.close(); //close file reader
	
	}
	
	
}