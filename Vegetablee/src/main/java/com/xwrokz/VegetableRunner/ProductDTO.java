package com.xwrokz.VegetableRunner;

public class ProductDTO {

	private int id;
	private String name;
	private BrandDTO brandDTO;
	private int price;
	private int quantity;
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int id, String name, BrandDTO brandDTO, int price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brandDTO = brandDTO;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", brandDTO=" + brandDTO + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brandDTO == null) ? 0 : brandDTO.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + quantity;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductDTO other = (ProductDTO) obj;
		if (brandDTO == null) {
			if (other.brandDTO != null)
				return false;
		} else if (!brandDTO.equals(other.brandDTO))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BrandDTO getBrandDTO() {
		return brandDTO;
	}
	public void setBrandDTO(BrandDTO brandDTO) {
		this.brandDTO = brandDTO;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
