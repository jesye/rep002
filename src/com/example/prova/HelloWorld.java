package com.example.prova;    //dichiarazione del package

//import se il programma utilizza classi che non sono nel pckg java.lang, importato in automatico dal compilatore

public class HelloWorld { //elemento classe, tutto quello compreso tra le {} appartiene alla classe, è il contenitore di tutti gli attributi e metodi specifici ad essa, è un classificatore, modello di gruppo di oggetti
	
	private static String messaggio = "Ciao Mondo"; //variabile, deve stare fuori dal main
	
	//entry point di attivazione del programma
	public static void //dichiarazione metodo, void perchè non ha ritorno, serve ad eseguire la classe
	main //nome metodo, obbligatorio main
	(String[] args) { //metodo con paametro di tipo array String, obbligatorio per questo metodo

		
		
			
		System.out.println("Hello World");  //variabili di scrittura
	    System.err.println(messaggio); //te lo stampa in rosso per specificare un errore, stampa il contenuto della variabile messaggio
		
	
			
	}  //chiusura del metodo

} //chiusura della classe





//con java creiamo oggetti, le classi rappresentano la collezione degli oggetti della stessa categoria, un oggetto è definito dal suo comportamento