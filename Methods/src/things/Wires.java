package things;

public class Wires {
	
	private String nameOfWires;
	private byte types;
	private int noOFWires;
	private short cost;
	private long viwers;
	private float meter;
	private double reviews;
	private boolean service;
	private char certificate;
	
	
	
	
	@Override
	public String toString() {
		return "Wires [nameOfWires=" + nameOfWires + ", types=" + types + ", noOFWires=" + noOFWires + ", cost=" + cost
				+ ", viwers=" + viwers + ", meter=" + meter + ", reviews=" + reviews + ", service=" + service
				+ ", certificate=" + certificate + "]";
	}
	
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wires other = (Wires) obj;
		if (certificate != other.certificate)
			return false;
		if (cost != other.cost)
			return false;
		if (Float.floatToIntBits(meter) != Float.floatToIntBits(other.meter))
			return false;
		if (nameOfWires == null) {
			if (other.nameOfWires != null)
				return false;
		} else if (!nameOfWires.equals(other.nameOfWires))
			return false;
		if (noOFWires != other.noOFWires)
			return false;
		if (Double.doubleToLongBits(reviews) != Double.doubleToLongBits(other.reviews))
			return false;
		if (service != other.service)
			return false;
		if (types != other.types)
			return false;
		if (viwers != other.viwers)
			return false;
		return true;
	}


	public String getNameOfWires() {
		return nameOfWires;
	}
	public void setNameOfWires(String nameOfWires) {
		this.nameOfWires = nameOfWires;
	}
	public byte getTypes() {
		return types;
	}
	public void setTypes(byte types) {
		this.types = types;
	}
	public int getNoOFWires() {
		return noOFWires;
	}
	public void setNoOFWires(int noOFWires) {
		this.noOFWires = noOFWires;
	}
	public short getCost() {
		return cost;
	}
	public void setCost(short cost) {
		this.cost = cost;
	}
	public long getViwers() {
		return viwers;
	}
	public void setViwers(long viwers) {
		this.viwers = viwers;
	}
	public float getMeter() {
		return meter;
	}
	public void setMeter(float meter) {
		this.meter = meter;
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
