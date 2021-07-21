package com.example.geometria;

public class Ellisse extends FormaGeometrica {

	private double a;  //variabile di istanza
	private double b;

	public Ellisse(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double area() {    //è la superclasse di Cerchio che eredita i metodi da qui
		double area = Math.PI * a * b;
		System.out.println("area ellisse: " + area);
		return area;
	}

	@Override
	public double perimetro() {
		double perimetro = (2 * Math.PI) * Math.sqrt((a * 2 + b * 2)/2);
System.out.println("perimetro ellisse: " + perimetro);
		return perimetro;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append("]");
		return builder.toString();
	}

}
