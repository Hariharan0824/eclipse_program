package com.xworkx.productsDTO;

import com.xworkz.RunnerDTO.Type;
import com.xwrok.xworkz.BrandDTO.BrandDTO;

public class ProductsDTO {

	private Integer id;
	private String name;
	private Type type;
	private BrandDTO brandDTO;
	private Integer price;
	private Integer quantity;
	public ProductsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductsDTO(Integer id, String name, Type type, BrandDTO brandDTO, Integer price, Integer quantity) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.brandDTO = brandDTO;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductsDTO [id=" + id + ", name=" + name + ", type=" + type + ", brandDTO=" + brandDTO + ", price="
				+ price + ", quantity=" + quantity + "]";
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
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		ProductsDTO other = (ProductsDTO) obj;
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
		if (type != other.type)
			return false;
		return true;
	}
	public Integer getId() {
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
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public BrandDTO getBrandDTO() {
		return brandDTO;
	}
	public void setBrandDTO(BrandDTO brandDTO) {
		this.brandDTO = brandDTO;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
