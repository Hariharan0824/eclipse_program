package runner;

import things.Paakashala;

public class PaakashalaRunner extends Paakashala{
	@Override
	public void freeTime() {
		System.out.println("This is Free Time");
	}
	@Override
	public void lunchTime() {
		System.out.println("This is Lunch Time");
	}
	@Override
	public void investments() {
		System.out.println("This is Investements");
	}
	public static void main(String[] args) {
		
		Paakashala water = new PaakashalaRunner();
		water.login();
		water.logout();
		water.breaks();
		water.investment();
		
		
		
		
	}

}
