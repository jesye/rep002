package com.example.linguaggio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;



public class ListDemo {

	
	
	private static final Logger log = LogManager.getLogger(ListDemo.class);
	
	public static void main(String[] args) {

List lista = new ArrayList(); //prende ogni tipo d'oggetto
List <Integer> listaN = new ArrayList<>(); //prende solo tipo Integer
		
	Random rand = new Random();	
	
	
	for (Integer i = 0; i<10; i++) {
		
		lista.add(rand.nextInt());
		
	}lista.add("topp"); //posso aggiungere sia integer che string che altro
	//log.info(lista.toString());
	
	
		
	log.debug("numero elementi in lista before {} ", + listaN.size()); //{} fa da placeholder per le variabili
	
	for (Integer i = 0; i<10; i++) {
		
		int generato = rand.nextInt();
		listaN.add(generato);
		
		log.debug("num generato {} numero elementi in lista during: {} ", generato, listaN.size());
	}
	log.debug("numero elementi in lista after: {} ", + lista.size());
//     log.info(listaN.toString());
	if(lista.size() <=0) {
		log.fatal("problemi con l'implementazione di List abort");
		throw new RuntimeException("List implementation not working");
		
		
	}
	
	}
}
