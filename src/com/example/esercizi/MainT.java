package com.example.esercizi;

import java.util.Arrays;
import java.util.Random;

public class MainT {

	public static void main(String[] args) {

//		Random rand = new Random();
//		int[] tombola = new int[90];
//		int estrazione = 0;
//		
//
//		for (int i = 0; i < tombola.length; i++) {
//
//			tombola[i] = i;                        //riempio la tombola fino a 90
//		}
//
//		for (int i = 0; i < tombola.length; i++) {      // ciclo 90 volte do un numero rand a estrazione
//			estrazione = rand.nextInt(90);              //estrae un num rand
//
//			while (tombola[estrazione] == 0) {      //finchè il num di estrazione è uguale a 0
//				estrazione = rand.nextInt(90);     //ripesca un altro num random
//				                                   //se è diverso da 0 salta il while 
//			
//			}
//			System.out.println("estrazione: " + " estratto "+ estrazione);
//            tombola[estrazione] = 0; //una volta uscito mette il num estratto a 0
//            //fino a estrarre tutti i numeri diversi da 0, li mette tutti a 0 e ciu ciu
//		}	

		
		TombolaConArray t = new TombolaConArray();
	//	t.pesca();
		t.estrai();

	}
}
