package com.example.linguaggio;

public class ContenitorePersonalizzabile <T> {

	
	private T object;

	public ContenitorePersonalizzabile(T object) { //personalizza il tipo di oggetto che vogliamo istanziare
		super();
		this.object = object;
	}

	public T getPay() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
