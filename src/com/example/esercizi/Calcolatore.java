package com.example.esercizi;

public class Calcolatore {

	Integer a;
	Integer b;
	
	
	
	
//	public Calcolatore(Integer a, Integer b) {
//		super();
//		this.a = a;
//		this.b = b;
//	}


	
	
	public Integer somma(Integer a, Integer b) {
		
		Integer c = a + b;
		
		System.out.println("somma: " + c);
		return c;
	}
	
	
	public Integer sottrai(Integer a, Integer b) {
		
		Integer c = a - b;
		System.out.println("differenza: " + c);
		return c;
		
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Calcolatore [a=");
		builder.append(a);
		builder.append(", b=");
		builder.append(b);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
