package things;

public class Testone {
	String email1="test@gmail.com";
	String password1="test";
	int[] ticket= {1,2,3,4,5,6,7,8,9,10};
	int movie;

	public Testone() {
		System.out.println("No-arg constructor");
	}


	public void accept(String email1,String password1,int ticketnumber) {
		System.out.println("Welcome to the page");
		for(int i=0;i<ticket.length;i++) {
			if(email1.equals(email1) && password1.equals(password1) && ticket[i]==ticketnumber) {
				System.out.println("avaiable");
			
			}


		}	
	}

	public void movie(int movie) {
		for(int i=0;i<ticket.length;i++) {
			if(ticket[i]==movie && movie>0 && movie<=10)
				System.out.println("Movie tickets:"+ticket[i]);
		}
		
		
	}



}
