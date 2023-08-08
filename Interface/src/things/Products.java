package things;

import com.xworkz.Interface.inter.ProdcutInterface;

public class Products implements ProdcutInterface{
	
	public Products() {
		System.out.println("This is No constructor");
	}
	
	public String getProductDetails() {
		return "This is Abstract method";
	}

}
