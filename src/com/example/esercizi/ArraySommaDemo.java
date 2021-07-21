package com.example.esercizi;

import java.util.Random;

//genera array[5] double
//mettici valori random double moltiplicati *1000, con il for
//stampa
//somma tutti gli indici, e poi solo quelli dispari

public class ArraySommaDemo {

	public static void main(String[] args) {

		double array[] = new double[5];
        Random rand = new Random();
		
        double somma = 0;    //si dichiara al di fuori dei cicli 
		double dis = 0;

		for (int indice = 0; indice < array.length; indice++) { //cicla l'indice per quanto è lungo l'array, incrementa ogni volta fino ad arrivare al valore di array.length

			array[indice] = rand.nextDouble() * 1000;    //al contenuto array da un valore random per ogni ciclo che fa

			System.out.println(indice + " [" + array[indice] + "]");  //stampa ogni indice, e poi stampa l'array[indice] come inizializzato sopra

		}

		//forEach
		for (double valore : array) {  //per ogni contenuto array, gli elementi vengono messi nella variabile a sinistra

			somma += valore;     // così equivale a somma = somma + array
//somma che parte da 0 ogni volta che cicla assume il valore di array[i] e somma con se stesso
		
		}

		for (int i = 1; i < array.length; i+=2) { 

			dis += array[i];
     
		}

		System.out.println("somma totale: " + somma);  //il risultato si mette fuori dal ciclo
	//	System.out.println("somma dispari: " + dis);   

		
	double sommaPari = 0;
		for (int indice = 0; indice < array.length; indice++) { 
			
			if(indice%2!=0) { //condizioni di scarto, in questo caso scarta gli indici pari
				//se la condizione è vera viene eseguito il blocco dell'if
				somma += array[indice]; 
			
				
			}	else { //se falsa fa il blocco else
				sommaPari += array[indice];
		
			}	
			
		}
		
		
		System.out.println("somma indici dispari: "+ somma);
		System.out.println("somma indici pari: "+ sommaPari);
		
		
		
		int i = 0; //l'indice si dichiara fuori
		while(i<array.length) {   //funziona come il for ma si scrive in questo modo
			System.out.println(i+") " + array[i] );
			i++;  //obbligatorio per arrivare a i<array.length, altrimenti va in loop infinito
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		double somma = array[0] + array[1] + array[2] + array[3] + array[4];
//		System.out.println("somma totale: " + somma);

//		double sommadis = array[1] + array[3];
//		System.out.println("somma indici dispari: " + sommadis);

	}

}
