package com.xworkz.RunnerDTO;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import com.xworkx.productsDTO.ProductsDTO;
import com.xwrok.xworkz.BrandDTO.BrandDTO;

public class RunnerDTO {
	public static void main(String[] args) {
		
		AddressDTO address1 = new AddressDTO(1, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address2 = new AddressDTO(2, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address3 = new AddressDTO(3, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address4 = new AddressDTO(4, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address5 = new AddressDTO(5, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address6 = new AddressDTO(6, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address7 = new AddressDTO(7, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address8= new AddressDTO(8, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address9 = new AddressDTO(9, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		AddressDTO address10 = new AddressDTO(10, 23, "BTM", "SilkBoard", "Electronic CIty",560100 );
		
		BrandDTO brand1 = new BrandDTO(1, 89765, 123, address1, "1990");
		BrandDTO brand2 = new BrandDTO(2, 89765, 123, address1, "1990");
		BrandDTO brand3 = new BrandDTO(3, 89765, 123, address1, "1990");
		BrandDTO brand4 = new BrandDTO(4, 89765, 123, address1, "1990");
		BrandDTO brand5 = new BrandDTO(5, 89765, 123, address1, "1990");
		BrandDTO brand6 = new BrandDTO(6, 89765, 123, address1, "1990");
		BrandDTO brand7 = new BrandDTO(7, 89765, 123, address1, "1990");
		BrandDTO brand8 = new BrandDTO(8, 89765, 123, address1, "1990");
		BrandDTO brand9 = new BrandDTO(9, 89765, 123, address1, "1990");
		BrandDTO brand10 = new BrandDTO(10, 89765, 123, address1, "1990");
		
		
		ProductsDTO products=new ProductsDTO(1,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products1=new ProductsDTO(2,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products2=new ProductsDTO(3,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products3=new ProductsDTO(4,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products4=new ProductsDTO(5,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products5=new ProductsDTO(6,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products6=new ProductsDTO(7,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products7=new ProductsDTO(8,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products8=new ProductsDTO(9,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		ProductsDTO products9=new ProductsDTO(10,"Mobile", Type.ELECTRONICS, brand1,1000, 1);
		
		Collection<ProductsDTO> collection1=new HashSet<ProductsDTO>();
		collection1.add(products);
		collection1.add(products1);
		collection1.add(products2);
		collection1.add(products3);
		collection1.add(products4);
		collection1.add(products5);
		collection1.add(products6);
		collection1.add(products7);
		collection1.add(products8);
		collection1.add(products9);
		
		
		System.out.println("*********************");
		List<ProductsDTO> prc=collection1.stream()
				.filter(e->e.getBrandDTO().getAddressDTO().getPinCode()==560100).collect(Collectors.toList());
		prc.forEach(e-> System.out.println(e));
		System.out.println("*********************");
		
		collection1.stream()
		.filter(e->e.equals(products))
		.map(e->e.getBrandDTO())
		.forEach(e->System.out.println(e));
		System.out.println("*********************");
		
		collection1.stream()
		.map(e->e.getBrandDTO().getAddressDTO()).forEach(e->System.out.println(e));
		System.out.println("*********************");
		
		collection1.stream()
		.sorted((a1,a2) -> a2.getPrice().compareTo(a1.getPrice()))
		.findFirst();
	}

	
	


}
