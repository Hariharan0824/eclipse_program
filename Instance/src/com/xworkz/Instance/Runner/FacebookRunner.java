package com.xworkz.Instance.Runner;

import com.xworkz.Instance.things.Facebook;

public class FacebookRunner {
	
	public static void main(String[] args) {
		Facebook facebook= new Facebook();
		facebook.register("Hari");
		facebook.register("Hari","Haran");
	    facebook.register("Hari","Haran","Male");
	    facebook.register("Hari","Haran","Male",1234);
	    facebook.register("Hari","Haran","Male",1234,123456789);
	    facebook.register("Hari","Haran","Male",1234,123456789,"abcd@123");
	    facebook.register("Hari","Haran","Male",1234,123456789,"abcd@123","Hari@123");
	    facebook.dispalyRegister();
	    facebook.login("Hari","abc@123");
	   System.out.println(facebook.login("Hari","abc@123"));
	};

}