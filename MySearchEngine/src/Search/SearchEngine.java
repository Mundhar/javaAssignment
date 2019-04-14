/* 
 * AlMundhar AlSalmi 
 * D16125575
 * SearchEngine Class
 * 
 */

package Search;

import java.io.BufferedReader;  
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
		

public  class SearchEngine extends MyGUI
{
	
	
	SearchEngine(String inputWord) 
	{
		super(inputWord);	
	}
	
	
	private void FileReader() throws IOException
	{
		File f1=new File("file1.txt"); //Creation of File Descriptor for input file
	    String[] words=null;  //Initialize the word Array
	    FileReader fr = new FileReader(f1);  //Creation of File Reader object
	    BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	    String s;     
	    String input="java";   // Input word to be searched
	    int count=0;   //Initialize the word to zero
	    
	    
	    
	    
	    while((s=br.readLine())!=null)   //Reading Content from the file
	    {
	    	words=s.split(" ");  //Split the word using space
	    	for (String word : words) 
	    	{
	               if (word.equals(input))   //Search for the given word
	               {
	                 count++;    //If Present increase the count by one
	               }
	        }
	    }
	    
	    
	    if(count!=0)  //Check for count not equal to zero
	    {
	       System.out.println("The word is present "+count+ " Times in the file: " + f1);
	    }
	    else
	    {
	       System.out.println("Word not found");
	    }
	    
	       fr.close();
	
	}
	
}