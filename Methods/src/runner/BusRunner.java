package runner;

import things.Bus;

public class BusRunner {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.setTicketPrice(4);
		if(bus.getTicketPrice()==4) {
			System.out.println("TicketPrice is:"+bus.getTicketPrice());
		}
		int bus1=bus.getTicketPrice();
		System.out.println("Converted Price:"+bus1);
		
		byte bus2=(byte)bus1;
		System.out.println("Converted Price:"+bus2);
		
		float bus3=(byte)bus2;
		System.out.println("Converted Price:"+bus3);
		
		double bus4=(byte)bus2;
		System.out.println("Converted Price:"+bus4);
		
		short bus5=(byte)bus2;
		System.out.println("Converted Price:"+bus5);
		
		char bus6=(char)bus2;
		System.out.println("Converted Price:"+bus6);
		
		
	}
	
}
