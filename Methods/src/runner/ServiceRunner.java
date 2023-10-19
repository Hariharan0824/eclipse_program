package runner;

import things.Services;

public class ServiceRunner {
	public static void main(String[] args) {
		Services services = new Services("Tv",3,"Mechanic",500);
		services.getNoOFUsers();
		services.getServiceName();
		services.getType();
		services.getSalary();
		
		System.out.println(services.getNoOFUsers());
		System.out.println(services.getType());
		System.out.println(services.getSalary());
		System.out.println(services.getServiceName());
		
	}

}
