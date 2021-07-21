package com.example.linguaggio;

import java.util.Random;

public class ArrayDemo { //gli array sono contenitori di variabili dello stesso tipo

	public static void main(String[] args) {
	
	int [] arr = new int[10];   //lo dichiari e gli dai spazio 10 numeri
	int arr2[] = {12, 33, -4, 34}; //lo inizializzi e ha automaticamente spazio 4
	int [] arr3 = new int[10];
	
	System.out.println("lunghezza array " + arr.length); //stampa la lunghezza dell'array
	
	System.out.println("stampa il valore alla posizione 3(indice) "+ arr2[3]); //la posizione si conta a partire da 0, quindi spazio 10 numeri, sono 9 posizioni(indici) a partire da 0 compreso
	
	
//per la variabile indice che vale a 0, che è minore della lunghezza dell'array, incrementa indice di 1
	for (int indice = 0; indice < arr2.length; indice = indice + 1 ) {  //stampa il valore dell'array già esplicitato
		
		System.out.println("arr2[" + indice +  "]=" + arr2[indice]);
		
		System.out.println(arr2[indice] + arr2[indice]);
							
	
	}
	
	for (int indice = 0; indice < arr.length; indice = indice + 1 ) {   //riempie l'array dei valori uguali al valore dell'indice
		
	   arr[indice] = indice;
	   System.out.println("arr2[" + indice +  "]" + arr[indice]);
	}
	
	
	Random rand = new Random(); //genera numeri random
	
	for (int indice = 0; indice < arr3.length; indice = indice + 1 ) {   

		arr[indice] = rand.nextInt();  // dai numeri degli indici gli da il valore random
		   System.out.println("arr3[" + indice +  "]" + arr[indice]); //solo indice vale quello del for, arr3[indice] vale quello random

	}
	
	
	}
}

