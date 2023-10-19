package com.xworkz.inheritance.things;

public class MovieMaker {
	public String director;
	public String producer;
	public String asstDirector;
	public String storyBy;
	public String musicBy;
	public String cinematography;
	public String editingBy;
	public String distribution;
	public String choreography;
	public String dop;
	
	public MovieMaker() {
		System.out.println("This is Moviemaker constructor");
	}

	public MovieMaker(String director, String producer, String asstDirector, String storyBy, String musicBy,
			String cinematography, String editingBy, String distribution, String choreography, String dop) {
		//super();
		this.director = director;
		this.producer = producer;
		this.asstDirector = asstDirector;
		this.storyBy = storyBy;
		this.musicBy = musicBy;
		this.cinematography = cinematography;
		this.editingBy = editingBy;
		this.distribution = distribution;
		this.choreography = choreography;
		this.dop = dop;
	}
	public String toString() {
		return "MovieMaker[director='"+director+"',"+"producer='"+producer+"',\"+\"asstDirector='\"+asstDirector+\"',\"+\"storyBy='\"+storyBy+\"',\"+\"musicBy='\"+musicBy+\"',\"+\"cinematography='\"+cinematography+\"',\"+\"editingBy='\"+editingBy+\"',\"+\"distribution='\"+distribution+\"',\"+\"choreography='\"+choreography+\"',\"+\"dop='\"+dop+\"']";
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
	
		if(getClass()!=obj.getClass())
			 return false;
		
		MovieMaker mm= (MovieMaker)obj;
		 if(this.director==mm.director && this.producer==mm.producer && this.asstDirector==mm.asstDirector && this.storyBy==mm.storyBy && this.musicBy==mm.musicBy && this.cinematography==mm.cinematography && this.distribution==mm.distribution && this.dop==mm.dop)
		 return true;
		 return false;
		
	}

}
