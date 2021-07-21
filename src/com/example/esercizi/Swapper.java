package com.example.esercizi;

public class Swapper {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;

		int swap = x;

	Integer z = 20;
	Integer w = 30;
	Integer t = z;
		
		System.out.println("valore iniziale X: " + x);
		System.out.println("valore iniziale Y: " + y);

		x = y;
		System.out.println("\n swap X:");
		System.out.println(x);

		y = swap;
		System.out.println("\n swap Y: ");
		System.out.println(y);

		
		
	// ---------------------------
	//	    SOLUZIONE ALTERNATIVA
		x = x + y;
		y = x - y;     //facendo calcoli senza prendere un altra variabile
		x = x - y;
		System.out.println("\n swap2 X:");
		System.out.println(x);	
		System.out.println("\n swap2 Y: ");
		System.out.println(y);
		
		
		System.out.println();
		System.out.println("valore iniziale Z: " + z);
		System.out.println("valore iniziale W: " + w);

		z = w;
		System.out.println("\n swap Z:");
		System.out.println(z);
       
		w = t;
		System.out.println("\n swap W: ");
		System.out.println(w);

	
	
	
	
	
	
		w = w + z;  //50
		z = w - z;  //20 = 50 - 20   //facendo calcoli senza prendere un altra variabile
		w = w - z;  //50 = 50 - 30
		System.out.println("\n swap2 W:");
		System.out.println(w);	
		System.out.println("\n swap2 Z: ");
		System.out.println(z);
		
	
	
	
	
	
	}

}
