package com.xwrokz.VegetableRunner;

import java.time.LocalDate;
import java.util.Collection;

public class WarDTO {

	private Integer id;
	private LocalDate startDate;
	private LocalDate endDate;
	private Collection<CountryDTO> countriesParticipated;
	private String wonBy;
	
	public WarDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WarDTO(Integer id, LocalDate startDate, LocalDate endDate, Collection<CountryDTO> countriesParticipated,
			String wonBy) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.countriesParticipated = countriesParticipated;
		this.wonBy = wonBy;
	}

	@Override
	public String toString() {
		return "WarDTO [id=" + id + ", startDate=" + startDate + ", endDate=" + endDate + ", countriesParticipated="
				+ countriesParticipated + ", wonBy=" + wonBy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countriesParticipated == null) ? 0 : countriesParticipated.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((wonBy == null) ? 0 : wonBy.hashCode());
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
		WarDTO other = (WarDTO) obj;
		if (countriesParticipated == null) {
			if (other.countriesParticipated != null)
				return false;
		} else if (!countriesParticipated.equals(other.countriesParticipated))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		if (wonBy == null) {
			if (other.wonBy != null)
				return false;
		} else if (!wonBy.equals(other.wonBy))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Collection<CountryDTO> getCountriesParticipated() {
		return countriesParticipated;
	}

	public void setCountriesParticipated(Collection<CountryDTO> countriesParticipated) {
		this.countriesParticipated = countriesParticipated;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}
	
	
	
	
	
}
