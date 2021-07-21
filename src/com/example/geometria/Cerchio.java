package com.example.geometria;

public class Cerchio extends Ellisse { // il cerchio è una forma geometrica e estende il concetto astratto di forma
										// geometrica che è definito dall'area e dal perimetro, metodi che eredita e
										// adatta con le sue formule

	private double raggio; // è accessibile solo all'interno della classe, float è un datatype per i numeri
							// con la virgola, più piccolo di double

	private double TT = 3.14; // double

	private double diametro;

	// public Cerchio() {} //senza parametri

	public Cerchio(double r) { // costruttore che prende i parametri input, invece di inizializzarli fissi
		super(r, r);    //così corrisponde alle formule di ellisse
		raggio = r;
		// diametro = d;
	}

//	public double area() {                                      //double per dargli il ritorno, public perchè il metodo è accessibile al di fuori della classe
//		double area = raggio * raggio * Math.PI;               //metto il calcolo nella variabile
//		//System.out.println("area: " + raggio * raggio * TT);
//		System.out.println("area cerchio: " + area);          //stampo la variabile
//		return area; //ritorno la variabile
//	}

	public double diametro() {
		double diametro = raggio * 2;
		// System.out.println("diametro: " + raggio * 2);
		System.out.println("diametro cerchio: " + diametro);
		return diametro;
	}

//	public double perimetro() {
//		double circonferenza = diametro * Math.PI;                  //math è un package che ha calcoli matematici 
//        //System.out.println("circonferenza: " + diametro * TT);
//		System.out.println("circonferenza cerchio: " + circonferenza);
//		return circonferenza;
//	}

	public double raggio() {
		double raggio = diametro / 2;
		// System.out.println("raggio: " + diametro / 2);
		System.out.println("raggio cerchio: " + raggio);
		return raggio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cerchio [raggio=");
		builder.append(raggio);
		builder.append(", TT=");
		builder.append(TT);
		builder.append(", diametro=");
		builder.append(diametro);
		builder.append("]");
		return builder.toString();
	}

}
