package com.xworkz.templee.dto;

public class TempleeDTO {
	private String name;
	private String place;
	private String mainGod;
	private String constYear;
	private String constBy;
	
	public TempleeDTO() {
		System.out.println("no-arg const");
	}

	public TempleeDTO(String name, String place, String mainGod, String constYear, String constBy) {
		super();
		this.name = name;
		this.place = place;
		this.mainGod = mainGod;
		this.constYear = constYear;
		this.constBy = constBy;
	}

	@Override
	public String toString() {
		return "TempleeDTO [name=" + name + ", place=" + place + ", mainGod=" + mainGod + ", constYear=" + constYear
				+ ", constBy=" + constBy + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public String getConstYear() {
		return constYear;
	}

	public void setConstYear(String constYear) {
		this.constYear = constYear;
	}

	public String getConstBy() {
		return constBy;
	}

	public void setConstBy(String constBy) {
		this.constBy = constBy;
	}
	
	

}
