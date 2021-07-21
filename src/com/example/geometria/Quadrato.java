package com.example.geometria;

public class Quadrato extends Rettangolo { //estende a sua volta rettangolo passando sotto a livello gerarchico, quindi ha le caratteristiche sia di forma geometrica che sta in cima che di rettangolo che sta sopra

	
	private double lato;
	
	
	
	
	public Quadrato(double lato) {
		super(lato, lato);          //si riferisce al costruttore della superclasse rettangolo, riempiendo i parametri con lato
		this.lato = lato;          //this per specificare che si riferisce alla variabile della classe che è uguale al parametro di input del costruttore
	}
	
	
	
	
	public double area() {
		
		double area = lato*lato;
		 System.out.println("area quadrato" + area);
		 return area;
		
		
	}
	
	
	public double perimetro() {
		
		double perimetro = lato * 4;
		System.out.println("perimetro quadrato" + perimetro);
		return perimetro;
		
		
		
		
		
	}

	@Override     //è la sovrascrizione di un metodo di una classe
	public String toString() {   //serve per stampare l'oggetto creato nel main sottoforma di stringa, altrimenti stampa un codice @alfanumerico
		StringBuilder builder = new StringBuilder();
		builder.append("Quadrato [lato=");
		builder.append(lato);
		builder.append("]");
		return builder.toString();
	}
	
	/*protected*/ private void faiQualcosa() {       //non puoi invocarlo all'esterno della classe, se è protected puoi sovrascriverlo nelle classi di gerarchia e usarlo nello stesso package
		System.out.println("qualcosa");
	}
	
	
	public void faccioQualcosa() {   //escamotage per invocarlo all'esterno della classe
		faiQualcosa();
	}
}
