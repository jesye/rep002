package com.example.linguaggio;

public class ContenitoreGenerico {

	private Object object; //se utilizziamo object invece dobbiamo castare tutto

	
	public ContenitoreGenerico(Object object) {
		super();
		this.object = object;
	}

	
	public Object getObject() {
		
		return object;
	}
	
	
	public void setObject(Object object) {
		this.object = object;
	}
	
}
