package com.example.esercizi;

import java.util.Arrays;
import java.util.Random;

//array[90] con valori da 1 a 90
//fai 90 estrazioni casuali per estrarre tutti i num dalla tomb
// no duplicati,
//tira fuori un numero random e al posto di quello ci mette 0, se richiama un numero che ormai è 0 la riestrae

public class TombolaConArray {

	Random rand = new Random();
	int[] tombola = new int[90];
	int estrazione;

     
			
        
        public void pesca() {
        	for (int i = 0; i < tombola.length; i++) {

    			tombola[i] = i;                        //riempio la tombola fino a 90
    		}

    		for (int i = 0; i < tombola.length; i++) {      // ciclo 90 volte do un numero rand a estrazione
    			estrazione = rand.nextInt(90);              //estrae un num rand

    			while (tombola[estrazione] == 0) {      //finchè il num di estrazione è uguale a 0
    				estrazione = rand.nextInt(90);     //ripesca un altro num random
    				                                   //se è diverso da 0 salta il while 
    			
    			}
    			tombola[estrazione] = 0; //una volta uscito mette il num estratto a 0
    			System.out.println("estrazione: " + " estratto "+ estrazione);
                
                //fino a estrarre tutti i numeri diversi da 0, li mette tutti a 0 e ciu ciu
    		}	
        }
    
        int count = 0;
        int ciclo =0;
    	public void estrai() {
    		for (int i = 0; i<tombola.length; i++) {
    			int num = i +1;
    				
    			tombola[i] = num;        //riempio l'array 
    		}	
    			while (count < tombola.length) { //conteggio giri che fa
    				ciclo++;
    				estrazione = rand.nextInt(90);	//mette un valore random in estrazione
    		if(tombola[estrazione] != 0) { //mette estrazione come valore dell'array e se è diverso da 0
    			 tombola[estrazione] = estrazione; //lo mette nell'array
    			tombola[estrazione] = 0;  //poi lo setta a 0
    			System.out.println((count + 1) + " n " + estrazione);
    			count++;     //incrementa il giro
    		}
    			}		
    		//	tombola[estrazione]= estrazione;  //lo mette nell'array
    			
    			System.out.println("n n " + count + " per " + ciclo);
    			
    		
    		}
    	}
    	
    		
    		
    
			
		
	

