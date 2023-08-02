package things;

public class Appititude {
	private int price;
	private int quantity;
	private int gst;
	private int ist;
	private int sst;
	private String review;
	public double totalPrice;
	
   public void setPrice(int price) {
	   this.price=price;
   }
   public int price() {
	   return this.price;
   }
   public void setQuantity(int quantity) {
	   this.quantity=quantity;
   }
   public int quantity() {
	   return this.price;
   }
   public void setGst(int gst) {
	   this.gst=gst;
   }
   public int gst() {
	   return this.gst;
   }
   public void setIst(int ist) {
	   this.ist=ist;
   }
   public int ist() {
	   return this.ist;
   }
   public void setSst(int sst) {
	   this.sst=sst;
   }
   public int sst() {
	   return this.sst;
   }
   public void setreview(String review) {
	   this.review=review;
   }
   public String review() {
	   return this.review;
   }
   public double calculation(double totalPrice) {
	   totalPrice=quantity*(price*(gst+ist+sst/100));
	   return totalPrice;
   }

}
