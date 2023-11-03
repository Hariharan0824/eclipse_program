package com.xwrokz.VegetableRunner;

public class CountryDTO {
	
	private int id;
	private String name;
	private String continent;
	private PresidentDTO presidentDto;
	public CountryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryDTO(int id, String name, String continent, PresidentDTO presidentDto) {
		super();
		this.id = id;
		this.name = name;
		this.continent = continent;
		this.presidentDto = presidentDto;
	}
	@Override
	public String toString() {
		return "CountryDTO [id=" + id + ", name=" + name + ", continent=" + continent + ", presidentDto=" + presidentDto
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continent == null) ? 0 : continent.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((presidentDto == null) ? 0 : presidentDto.hashCode());
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
		CountryDTO other = (CountryDTO) obj;
		if (continent == null) {
			if (other.continent != null)
				return false;
		} else if (!continent.equals(other.continent))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (presidentDto == null) {
			if (other.presidentDto != null)
				return false;
		} else if (!presidentDto.equals(other.presidentDto))
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
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public PresidentDTO getPresidentDto() {
		return presidentDto;
	}
	public void setPresidentDto(PresidentDTO presidentDto) {
		this.presidentDto = presidentDto;
	}
	
	
	
	

}