package things;

public class Juice {
	private String juiceName;
	private byte viewers;
	private int noOfjuice;
	private short drinker;
	private long fruitJuice;
	private float ratings;
	private double profit;
	private boolean service;
	private char certificate;


	public String getJuiceName() {
		return juiceName;
	}

	public void setJuiceName(String juiceName) {
		this.juiceName = juiceName;
	}
	@Override
	public String toString() {
		return "Juice [juiceName=" + juiceName + ", viewers=" + viewers + ", noOfjuice=" + noOfjuice + ", drinker="
				+ drinker + ", fruitJuice=" + fruitJuice + ", ratings=" + ratings + ", profit=" + profit + ", service="
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
		Juice other = (Juice) obj;
		if (certificate != other.certificate)
			return false;
		if (drinker != other.drinker)
			return false;
		if (fruitJuice != other.fruitJuice)
			return false;
		if (juiceName == null) {
			if (other.juiceName != null)
				return false;
		} else if (!juiceName.equals(other.juiceName))
			return false;
		if (noOfjuice != other.noOfjuice)
			return false;
		if (Double.doubleToLongBits(profit) != Double.doubleToLongBits(other.profit))
			return false;
		if (Float.floatToIntBits(ratings) != Float.floatToIntBits(other.ratings))
			return false;
		if (service != other.service)
			return false;
		if (viewers != other.viewers)
			return false;
		return true;
	}

	public byte getViewers() {
		return viewers;
	}
	public void setViewers(byte viewers) {
		this.viewers = viewers;
	}
	public int getNoOfjuice() {
		return noOfjuice;
	}
	public void setNoOfjuice(int noOfjuice) {
		this.noOfjuice = noOfjuice;
	}
	public short getDrinker() {
		return drinker;
	}
	public void setDrinker(short drinker) {
		this.drinker = drinker;
	}
	public long getFruitJuice() {
		return fruitJuice;
	}
	public void setFruitJuice(long fruitJuice) {
		this.fruitJuice = fruitJuice;
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
