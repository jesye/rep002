package com.example.linguaggio;

public class Main {

	
	
	public static void main(String[] args) {

		PassaggioByValue a = new PassaggioByValue();
		int x = 100;
		
		a.cambiaValore(x);
 System.out.println(x); //mi stampa il valore di x come variabile di classe
		
	
         Container c = new Container();

	       a.passbyv(c);   
	       //metodo di passaggiobyvalue con metodo che ha la classe container come parametro, oggetto di container diventa il parmetro del metodo dell'oggetto di passaggiobyvalue
	
	
	  
	


	

	
	
	
	
	
	
}
}