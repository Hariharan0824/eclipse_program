package com.xwrok.xworkz.BrandDTO;

import com.xworkz.RunnerDTO.AddressDTO;

public class BrandDTO {

	private Integer id;
	private Integer number;
	private Integer gstNo;
	private AddressDTO addressDTO;
	private String estFrom;
	public BrandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandDTO(Integer id, Integer number, Integer gstNo, AddressDTO addressDTO, String estFrom) {
		super();
		this.id = id;
		this.number = number;
		this.gstNo = gstNo;
		this.addressDTO = addressDTO;
		this.estFrom = estFrom;
	}
	@Override
	public String toString() {
		return "BrandDTO [id=" + id + ", number=" + number + ", gstNo=" + gstNo + ", addressDTO=" + addressDTO
				+ ", estFrom=" + estFrom + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressDTO == null) ? 0 : addressDTO.hashCode());
		result = prime * result + ((estFrom == null) ? 0 : estFrom.hashCode());
		result = prime * result + gstNo;
		result = prime * result + id;
		result = prime * result + number;
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
		BrandDTO other = (BrandDTO) obj;
		if (addressDTO == null) {
			if (other.addressDTO != null)
				return false;
		} else if (!addressDTO.equals(other.addressDTO))
			return false;
		if (estFrom == null) {
			if (other.estFrom != null)
				return false;
		} else if (!estFrom.equals(other.estFrom))
			return false;
		if (gstNo != other.gstNo)
			return false;
		if (id != other.id)
			return false;
		if (number != other.number)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getGstNo() {
		return gstNo;
	}
	public void setGstNo(int gstNo) {
		this.gstNo = gstNo;
	}
	public AddressDTO getAddressDTO() {
		return addressDTO;
	}
	public void setAddressDTO(AddressDTO addressDTO) {
		this.addressDTO = addressDTO;
	}
	public String getEstFrom() {
		return estFrom;
	}
	public void setEstFrom(String estFrom) {
		this.estFrom = estFrom;
	}
	
	
	
}
