package things;

public class Book {
	private String bookName;
	private byte author;
	private int pages;
	private short cost;
	private long viwers;
	private float ratings;
	private double reviews;
	private boolean service;
	private char certificate;
	
	
	
	
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", pages=" + pages + ", cost=" + cost + ", viwers="
				+ viwers + ", ratings=" + ratings + ", reviews=" + reviews + ", service=" + service + ", certificate="
				+ certificate + "]";
	}
	
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author != other.author)
			return false;
		if (bookName == null) {
			if (other.bookName != null)
				return false;
		} else if (!bookName.equals(other.bookName))
			return false;
		if (certificate != other.certificate)
			return false;
		if (cost != other.cost)
			return false;
		if (pages != other.pages)
			return false;
		if (Float.floatToIntBits(ratings) != Float.floatToIntBits(other.ratings))
			return false;
		if (Double.doubleToLongBits(reviews) != Double.doubleToLongBits(other.reviews))
			return false;
		if (service != other.service)
			return false;
		if (viwers != other.viwers)
			return false;
		return true;
	}


	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public byte getAuthor() {
		return author;
	}
	public void setAuthor(byte author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
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
