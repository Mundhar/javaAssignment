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
	
	//attributes
	String fileName;
	private String inputWord;
	private String s;
	
	int count=0;   //Initialize the word to zero
    
	
	//constructor
	SearchEngine (String fileName, String inputWord)
	{
		super(fileName, inputWord);
		
		this.fileName = fileName;
		this.setInputWord(inputWord);
	}
	
	
	//get and set
	String getS() {
		return s;
	}
	void setS(String s) {
		this.s = s;
	}


	
	
	
	
	String getInputWord() {
		return inputWord;
	}


	void setInputWord(String inputWord) {
		this.inputWord = inputWord;
	}


	File f1=new File("file1.txt"); //Creation of File Descriptor for input file
	 
    String[] words=null;  //Initialize the word Array
    FileReader fr1 = new FileReader(f1);  //Creation of File Reader object
    
    BufferedReader br1 = new BufferedReader(fr1); //Creation of BufferedReader object
    
   
    
    
    while((s=br1.readLine())!=null)   //Reading from the file
    {     	  
       words=fileName.split(" ");  //Split the word using space
        for (String word : words) 
        {
               if (word.equals(getInputWord()))   //Search for the given word
               {
                 count++;    //If Present increase the count by one
             
               }
        }
    }
    
    
    if(count!=0)  //Check for count not equal to zero
    {
    	
       System.out.println("The word is present for "+count+ " Times in the file");
       System.out.println("It is located in " + fileName );
       
    }
    else
    {
       System.out.println("Word not found");
    }
    
       fr1.close();
    
 }
}
