package runner;

import things.Operations;

public class OperationRunner {
	public static void main(String[] args) {
		Operations add = new Operations();
		int value=add.cal("+", 3, 7);
		System.out.println(value);
		int value1=add.cal("-", 3, 7);
		System.out.println(value1);
		int value2=add.cal("*", 3, 7);
		System.out.println(value2);
		int value3=add.cal("/", 3, 7);
		System.out.println(value3);
	}

}
