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
		File f2=new File("file2.txt");
		
		//initializing the word array
	    String[] words=null;
	    
	    //creating file reader object
	    FileReader fr1 = new FileReader(f1);
	    FileReader fr2 = new FileReader(f2);
	    
	    //creating buffered reader object
	    BufferedReader br1 = new BufferedReader(fr1); 
	    BufferedReader br2 = new BufferedReader(fr2); 
	    
	    //initializing string for word split 
	    String s;     
	    
	    //initializing counters
	    int countFr1=0;
	    int countFr2=0;
	    
	    
	    
	    //while loop to read content from file1
	    while((s=br1.readLine())!=null)
	    {
	    	
	    	input = input.toLowerCase();
	    	words=s.split(" ");  //split the word using space
	    	
	    	//for loop for searching the given word
	    	for (String word : words) 
	    	{
	               if (word.equals(input))
	               {
	                 countFr1++; //if word is found increase the count by one
	               }
	        }
		    
	    }
	    
	  //while loop to read content from file2
	    while((s=br2.readLine())!=null)
	    {

	    	input = input.toLowerCase();
	    	words=s.split(" ");  //split the word using space
	    	
	    	//for loop for searching the given word
	    	for (String word : words) 
	    	{
	               if (word.equals(input))
	               {
	                 countFr2++; //if word is found increase the count by one
	               }
	        }
	    	
	    }
	    
	    
	    //if statement to print how many times and in which file the word was found in
	    if(countFr1!=0)  
	    {
	    	//if yes, print how many time word is present
	       System.out.println("The word is present "+countFr1+ " times in " +f1);
	       
	    }
	    if(countFr2!=0)  
	    {
	    	//if yes, print how many time word is present
	       System.out.println("The word is present "+countFr2+ " times in " +f2);
	       
	    }
	    else
	    {
	    	//if no, print word not found
	       System.out.println("Word not found");
	    }
	    
	   	    
	    fr1.close(); //close file reader 1
	    fr2.close(); //close file reader 2
	}
	
	
}