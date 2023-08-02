package things;

public class Brands {
	private String brandName;
	private byte viewers;
	private int noOfBrands;
	private short users;
	private long usingBrands;
	private float ratings;
	private double profit;
	private boolean service;
	private char certificate;
	public String getBrandName() {
		return brandName;
	}
	
	@Override
	public String toString() {
		return "Brands [brandName=" + brandName + ", viewers=" + viewers + ", noOfBrands=" + noOfBrands + ", users="
				+ users + ", usingBrands=" + usingBrands + ", ratings=" + ratings + ", profit=" + profit + ", service="
				+ service + ", certificate=" + certificate + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Brands other = (Brands) obj;
		if (brandName == null) {
			if (other.brandName != null)
				return false;
		} else if (!brandName.equals(other.brandName))
			return false;
		if (certificate != other.certificate)
			return false;
		if (noOfBrands != other.noOfBrands)
			return false;
		if (Double.doubleToLongBits(profit) != Double.doubleToLongBits(other.profit))
			return false;
		if (Float.floatToIntBits(ratings) != Float.floatToIntBits(other.ratings))
			return false;
		if (service != other.service)
			return false;
		if (users != other.users)
			return false;
		if (usingBrands != other.usingBrands)
			return false;
		if (viewers != other.viewers)
			return false;
		return true;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public byte getViewers() {
		return viewers;
	}
	public void setViewers(byte viewers) {
		this.viewers = viewers;
	}
	public int getNoOfBrands() {
		return noOfBrands;
	}
	public void setNoOfBrands(int noOfBrands) {
		this.noOfBrands = noOfBrands;
	}
	public short getUsers() {
		return users;
	}
	public void setUsers(short users) {
		this.users = users;
	}
	public long getUsingBrands() {
		return usingBrands;
	}
	public void setUsingBrands(long usingBrands) {
		this.usingBrands = usingBrands;
	}
	public float getRatings() {
		return ratings;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
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
