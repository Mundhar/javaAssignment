/* 
 * AlMundhar AlSalmi
 * D16125575
 * Control Class
 * 
 */

package Search;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Control extends MyGUI
{
	
	Control(String title, String inputWord) {
		super(title, inputWord);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException 
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
	
	
	
