package com.example.linguaggio;

public class ContenitoreMain {

	public static void main(String[] args) {

		//un Double è un object, ma un object non può essere un double
	Double d = 12.78;	
		String s = "HW";
		ContenitoreGenerico c = new ContenitoreGenerico(d);
		

		d = (Double) c.getObject(); //e quindi si deve castare per convertirlo da obj a double
	
		
		//adattiamo il tipo di oggetto che vogliamo al momento dell'istanza
		ContenitorePersonalizzabile<String> cp = new ContenitorePersonalizzabile(s);
		
		String str = cp.getPay();
		System.out.println(str);
		
		
	}

}
