package things;

public class Services {
	
	public String serviceName;
	private int noOFUsers;
	protected String type;
	int salary;
	public Services(String serviceName, int noOFUsers, String type, int salary) {
		super();
		this.serviceName = serviceName;
		this.noOFUsers = noOFUsers;
		this.type = type;
		this.salary = salary;
	}
	public int getNoOFUsers() {
		return noOFUsers;
	}
	public void setNoOFUsers(int noOFUsers) {
		this.noOFUsers = noOFUsers;
	}
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Services [serviceName=" + serviceName + ", noOFUsers=" + noOFUsers + ", type=" + type + ", salary="
				+ salary + "]";
	}
	
	
	

}
