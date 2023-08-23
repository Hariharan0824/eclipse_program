package com.xworkz.dtos;

public class CourtDTO {

	private String location;
	private int cases;
	private String lawyers;
	private String type;
	public CourtDTO(String location, int cases, String lawyers, String type) {
		super();
		this.location = location;
		this.cases = cases;
		this.lawyers = lawyers;
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	public String getLawyers() {
		return lawyers;
	}
	public void setLawyers(String lawyers) {
		this.lawyers = lawyers;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cases;
		result = prime * result + ((lawyers == null) ? 0 : lawyers.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
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
		CourtDTO other = (CourtDTO) obj;
		if (cases != other.cases)
			return false;
		if (lawyers == null) {
			if (other.lawyers != null)
				return false;
		} else if (!lawyers.equals(other.lawyers))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CourtDTO [location=" + location + ", cases=" + cases + ", lawyers=" + lawyers + ", type=" + type + "]";
	}
	
	
}
