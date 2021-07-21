package com.example.main;

import com.example.geometria.Cerchio; //siccome non è nello stesso package bisogna importare la classe
import com.example.geometria.Ellisse;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

public class Main {

	public static void main(String[] args) {

		Cerchio c = new Cerchio(10); // oggetto della classe cerchio

		 //eredita il metodo dalla superclasse Ellisse
		double area =c.area(); 
		System.out.println("area cerchio " + area);
		// c.diametro();
		c.perimetro();
		// c.raggio();

		Rettangolo r = new Rettangolo(4.4, 15);
		r.area();
		r.perimetro();

		// Cerchio c2 = new Cerchio();      //non da errore perchè c'è un altro costruttore senza parametri
		

		Quadrato q = new Quadrato(5);
		q.area();
		q.perimetro();

		Ellisse e = new Ellisse(10, 10);
		e.perimetro();
		e.area();

		System.out.print("\n" + c);
		System.out.println(r);
		System.out.println(q);
		System.out.println(e);
	}

}
