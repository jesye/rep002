package com.example.linguaggio;

public class PassaggioByValue {



public void cambiaValore(int k) {
	
	k = k + 100;
	System.out.println(k);  //in questo modo mi stampa il risultato del metodo

	
	
}


public void passbyv(Container container) { //mette la classe come parametro
	
	System.out.println("valore iniziale: "+ container.getValore()); //legge il valore
	container.setValore(50);   //modifica il valore
	System.out.println("valore passato: "+ container.getValore());  //rilegge il valore
	
	
	
	
}












}
