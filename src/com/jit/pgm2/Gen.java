package com.jit.pgm2;

public class Gen<T> {
	T ob;

	Gen(T ob) {
		this.ob = ob;
	}

	public void show() {
		System.out.println("The type of ob : " + ob.getClass().getName());
	}

	public T getOb() {
		return ob;
	}
}
