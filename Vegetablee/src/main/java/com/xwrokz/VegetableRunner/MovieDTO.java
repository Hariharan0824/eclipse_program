package com.xwrokz.VegetableRunner;

public class MovieDTO {
	
	private int id;
	private String name;
	private String director;
	private String producer;
	private int budget;
	public MovieDTO(int id, String name, String director, String producer, int budget) {
		super();
		this.id = id;
		this.name = name;
		this.director = director;
		this.producer = producer;
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", director=" + director + ", producer=" + producer
				+ ", budget=" + budget + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + budget;
		result = prime * result + ((director == null) ? 0 : director.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
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
		MovieDTO other = (MovieDTO) obj;
		if (budget != other.budget)
			return false;
		if (director == null) {
			if (other.director != null)
				return false;
		} else if (!director.equals(other.director))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	

}
