package com.example.geometria;

public class Rettangolo extends FormaGeometrica {   //definizione di rettangolo

	
	private double base = 10;
	private double altezza = 20;
	
	
	public Rettangolo(double base, double altezza) {
		super();
		this.base = base;
		this.altezza = altezza;
	}


	public double area() {
		double area = base * altezza;
		System.out.println("area rettangolo" + area);
		return area;	
	}
	
	
	public double perimetro()
	{
		double perimetro =  base * 2 + altezza * 2;
		System.out.println("perimetro rettangolo" + perimetro);
	    return perimetro;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rettangolo [base=");
		builder.append(base);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
