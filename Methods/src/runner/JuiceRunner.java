package runner;

import things.Juice;

public class JuiceRunner {
	public static void main(String[] args) {
		Juice brands = new Juice();
		brands.setViewers((byte)40);
		brands.getViewers();
		System.out.println(brands.getViewers());
		
		
	//primitive data type to String
		Byte brand1=30;
		System.out.println("byte to String:"+brand1.toString());
		
		Short brand2=30;
		System.out.println("Short to String:"+brand2.toString());
		
		Integer brand3=30;
		System.out.println("Integer t0 String:"+brand3.toString());
		
		Long brand4=15649877665l;
		System.out.println("Long to String:"+brand4.toString());
		
		Float brand5=30f;
		System.out.println("Float to String:"+brand5.toString());
		
		Double brand6=30d;
		System.out.println("Double to String:"+brand6.toString());
		
		Boolean brand7=false;
		System.out.println("Boolean to String:"+brand7.toString());
		
		Character brand8='a';
		System.out.println("Character to String:"+brand8.toString());
		
	//String to Primitive data types
		
		String viewers="30";
		byte b=Byte.parseByte(viewers);
		System.out.println("String to byte:"+b);
		
		String noOfBrands="30";
		int b1=Integer.parseInt(noOfBrands);
		System.out.println("String to int:"+b1);
		
		String users="30";
		Short b2=Short.parseShort(users);
		System.out.println("String to shot:"+b2);
		
		String usingBrands="30";
		long b3=Long.parseLong(usingBrands);
		System.out.println("String to long:"+b3);
		
		String ratings="30";
		float b4=Float.parseFloat(ratings);
		System.out.println("String to float:"+b4);
		
		String profit="30";
		double b5=Double.parseDouble(profit);
		System.out.println("String to double:"+b5);
		
		String service="30";
		boolean b6=Boolean.parseBoolean(service);
		System.out.println("String to boolean:"+b6);
		
		String certificate="30";
		System.out.println("String to byte:"+certificate);
		
	}

}
