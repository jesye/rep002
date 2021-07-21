package com.example.prova;

import java.util.ArrayList;
import java.util.Arrays;

public class Telefono { //la classe è un modello, è un progetto e un'astrazione

    
	
	int[] array = new int [10];
	boolean chiamo;
	
	
	public int[] fareIlNumero(int [] array) {
   			
			for (int i=0; i<array.length; i++) {
				
				array[i] = array[i];
	    		  
			}
	   System.out.println(Arrays.toString(array));
	  return array;
    } 
	
	
	
      public void chiamare(int [] array) {    //un oggetto è definito da quello che fa
    	  
    	  for (int i=0; i<array.length; i++) {
				
			array[i] = array[i]; 
			}
				  
	    		if (array[0]== 3)  {
                   System.out.println("chiamata in corso");	    			
	    		}
	    		else {
                     System.out.println("errore chiamata");	    	
         
	    		
	    		}
    	  }
    	 
    	  
    	  
    	  
    	  
	

     
      public void staccare() {
    
    	  System.out.println("-----------------");
    	  System.out.println("chiamata terminata");
    	  
    	  
    }







}
