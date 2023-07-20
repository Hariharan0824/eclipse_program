package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.things.Mall;

public class MallRunner extends Mall {
	
public static void main(String[] args) {
	Mall obj = new Mall();
	Mall obj1 = new Mall();
	
	boolean item= obj.equals(obj1);
	System.out.println(item);
	System.out.println(obj.getClass());
	int hashcode=obj.hashCode();
	System.out.println(hashcode);
	String mall=obj.toString();
	System.out.println(mall);

	System.out.println(obj.clone());
	obj.finalize();
}
	
}
	



