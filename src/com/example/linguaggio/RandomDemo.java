package com.example.linguaggio;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {

		Random rand = new Random();

		for (int i = 0; i < 3; i++) {

			System.out.println("valore generato = " + rand.nextInt()); //valori random infinit

		}

		for (int i = 0; i < 3; i++) {

			System.out.println("valore generato = " + rand.nextInt(5)); // 5 è il massimo valore che può essere tirato fuori dalla random, meno il valore specificato tra parentesi

		}

	}

}
