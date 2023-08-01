package things;

public  class Test {
	final String email="test@gamil.com";
	final  String password="test";

public Test() {
	System.out.println("no argument constructor");
}
	
	public void accept(String email1,String password1) {
		
		if(email.equals(email1) && password.equals(password1)) {
			System.out.println("Welcome to the page");
		}else {
			System.out.println("Incorrect email and password");
		}
	}	

}
