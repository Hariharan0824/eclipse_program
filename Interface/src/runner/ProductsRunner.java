package runner;

import com.xworkz.Interface.inter.ProdcutInterface;

import things.Products;

public class ProductsRunner {
	public static void main(String[] args) {
		Products product = new Products();
		String product1=product.getProductDetails();
		System.out.println(product1);
		
int value=product.setProducts();
System.out.println(value);

ProdcutInterface.selling();
	}

}
