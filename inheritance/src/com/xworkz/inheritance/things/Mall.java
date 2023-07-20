package com.xworkz.inheritance.things;

public class Mall extends Object {
	public int hashCode() {
		return 1500;
	}
	public boolean equals(Object obj) {
		return (obj=="Item");
	}

	public String toString() {
	return "ItemName";
	}

	public Object clone() {
		return "This is item clone";
	}
	public void finalize() {
		System.out.println("finalize()");
	}
}