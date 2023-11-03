package com.xworkz.perfums.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class PerfumesDTO {
	
	private String brandName;
	private int price;
	private int quantity;
	private String perfumeNote;
	private String countryOrigin;
	public PerfumesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PerfumesDTO(String brandName, int price, int quantity, String perfumeNote, String countryOrigin) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.quantity = quantity;
		this.perfumeNote = perfumeNote;
		this.countryOrigin = countryOrigin;
	}
	@Override
	public String toString() {
		return "PerfumesDTO [brandName=" + brandName + ", price=" + price + ", quantity=" + quantity + ", perfumeNote="
				+ perfumeNote + ", countryOrigin=" + countryOrigin + "]";
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
	public String getPerfumeNote() {
		return perfumeNote;
	}
	public void setPerfumeNote(String perfumeNote) {
		this.perfumeNote = perfumeNote;
	}
	public String getCountryOrigin() {
		return countryOrigin;
	}
	public void setCountryOrigin(String countryOrigin) {
		this.countryOrigin = countryOrigin;
	}
	
	  
	
}
