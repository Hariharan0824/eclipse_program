package things;

public class Tickets {

	private String ticketName;
	private byte passenger;
	private int noOFTickets;
	private short cost;
	private long workers;
	private float ratings;
	private double reviews;
	private boolean service;
	private char certificate;




	@Override
	public String toString() {
		return "Tickets [ticketName=" + ticketName + ", passenger=" + passenger + ", noOFTickets=" + noOFTickets
				+ ", cost=" + cost + ", workers=" + workers + ", ratings=" + ratings + ", reviews=" + reviews
				+ ", service=" + service + ", certificate=" + certificate + "]";
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tickets other = (Tickets) obj;
		if (certificate != other.certificate)
			return false;
		if (cost != other.cost)
			return false;
		if (noOFTickets != other.noOFTickets)
			return false;
		if (passenger != other.passenger)
			return false;
		if (Float.floatToIntBits(ratings) != Float.floatToIntBits(other.ratings))
			return false;
		if (Double.doubleToLongBits(reviews) != Double.doubleToLongBits(other.reviews))
			return false;
		if (service != other.service)
			return false;
		if (ticketName == null) {
			if (other.ticketName != null)
				return false;
		} else if (!ticketName.equals(other.ticketName))
			return false;
		if (workers != other.workers)
			return false;
		return true;
	}


	public String getTicketName() {
		return ticketName;
	}
	public void setTicketName(String ticketName) {
		this.ticketName = ticketName;
	}
	public byte getPassenger() {
		return passenger;
	}
	public void setPassenger(byte passenger) {
		this.passenger = passenger;
	}
	public int getNoOFTickets() {
		return noOFTickets;
	}
	public void setNoOFTickets(int noOFTickets) {
		this.noOFTickets = noOFTickets;
	}
	public short getCost() {
		return cost;
	}
	public void setCost(short cost) {
		this.cost = cost;
	}
	public long getWorkers() {
		return workers;
	}
	public void setWorkers(long workers) {
		this.workers = workers;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public double getReviews() {
		return reviews;
	}
	public void setReviews(double reviews) {
		this.reviews = reviews;
	}
	public boolean isService() {
		return service;
	}
	public void setService(boolean service) {
		this.service = service;
	}
	public char getCertificate() {
		return certificate;
	}
	public void setCertificate(char certificate) {
		this.certificate = certificate;
	}



}
