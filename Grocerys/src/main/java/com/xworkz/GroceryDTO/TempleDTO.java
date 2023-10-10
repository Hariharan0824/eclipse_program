package com.xworkz.GroceryDTO;

public class TempleDTO {
	
	private String name;
	private String place;
	private String mainGod;
	private int year;
	private String constBy;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
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
		TempleDTO other = (TempleDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}
	public TempleDTO(String name, String place, String mainGod, int year, String constBy) {
		super();
		this.name = name;
		this.place = place;
		this.mainGod = mainGod;
		this.year = year;
		this.constBy = constBy;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getConstBy() {
		return constBy;
	}
	public void setConstBy(String constBy) {
		this.constBy = constBy;
	}
	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", place=" + place + ", mainGod=" + mainGod + ", year=" + year + ", constBy="
				+ constBy + "]";
	}
	
	

}
