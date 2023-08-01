package things;

public abstract class Paakashala {
	public String name;
	public int workers;
	public int workingTimes;
	public String brandName;
	
	public Paakashala() {
		System.out.println("This is Paakashala No Argument Constructor");
	}

	public Paakashala(String name, int workers, int workingTimes, String brandName) {
		//super();
		this.name = name;
		this.workers = workers;
		this.workingTimes = workingTimes;
		this.brandName = brandName;
	}
	public void login() {
		System.out.println("Login Time");
	}
	public void logout() {
		System.out.println("Logout Time");
	}
	public void breaks() {
		System.out.println("Break Times");
	}
	public void investment() {
		System.out.println("Investement to the Products");
	}
	
	public abstract void freeTime();
	public abstract void lunchTime(); 
	public abstract void investments();
	
	
	}
