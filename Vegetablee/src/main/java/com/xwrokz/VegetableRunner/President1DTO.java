package com.xwrokz.VegetableRunner;

public class President1DTO {

	private String name;
	private Integer id;
	private String emailid;
	private Long mobileNumber;
	
	private President1DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public President1DTO(String name, int id, String emailid, long l) {
		super();
		this.name = name;
		this.id = id;
		this.emailid = emailid;
		this.mobileNumber = l;
	}
	@Override
	public String toString() {
		return "President1DTO [name=" + name + ", id=" + id + ", emailid=" + emailid + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	
	
}
