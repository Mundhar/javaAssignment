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
		int i = 1;
		
		//while loop to keep the program running 
		while(i != 0)
		{
			
			System. out. println("Enter a word: ");
			
			//scanner to ask for user input
			Scanner txt = new Scanner(System. in);
					
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
		    
		    		    
		    //asking the user which file to search
		    System. out. println("\nWhich file do you want to search? file1, file2 or both?");
		    Scanner sFile = new Scanner(System. in);
		    
		    String fileName = sFile.nextLine();
		    fileName = fileName.toLowerCase(); // convert the letters to lower case
		    
		    //if statement to search the files that the user chose
		    if(fileName.equals("file1"))
		    {		    
		    
			    //while loop to read content from file1
			    while((s=br1.readLine())!=null)
			    {
			    	
			    	input = input.toLowerCase(); // convert the letters to lower case
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
		    }
		    else if (fileName.equals("file2"))
		    {
			    //while loop to read content from file2
			    while((s=br2.readLine())!=null)
			    {
		
			    	input = input.toLowerCase(); // convert the letters to lower case
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
		    }
		    else if (fileName.equals("both"))
		    {
		    	
		    	 //while loop to read content from file1
			    while((s=br1.readLine())!=null)
			    {
			    	
			    	input = input.toLowerCase(); // convert the letters to lower case
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
		
			    	input = input.toLowerCase(); // convert the letters to lower case
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
			    		    		    	
		    }
		    else
		    {
		    	System.out.println("File not found, please enter file name correctly.\n");
		    }
		    
		    
		    
		    //if statement to print how many times and in which file the word was found in
		    if(countFr1!=0)  
		    {
		    	//if yes, print how many time word is present
		       System.out.println("The word is present "+countFr1+ " times in " +f1);
		       
		    }
		    else if(countFr2!=0)  
		    {
		    	//if yes, print how many time word is present
		       System.out.println("The word is present "+countFr2+ " times in " +f2);
		       
		    }
		    else
		    {
		    	//if no, print word not found
		       System.out.println("Word not found\n");
		    }
		    
		   	    
		    fr1.close(); //close file reader 1
		    fr2.close(); //close file reader 2
		}
	}

	
	
}