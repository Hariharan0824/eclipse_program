package things;

public class Bus {
	private String busName;
	private int ticketPrice;
	
	public Bus() {
		System.out.println("No Argument Constructor");
	}
	public void setBusName(String busName) {
		this.busName=busName;
	}
	public 	String getBusName() {
		return this.busName;
	}
	public void setTicketPrice(int ticketPrice ) {
		this.ticketPrice=ticketPrice;
	}
	public 	int getTicketPrice() {
		return this.ticketPrice;
	}
	
	
	

}
