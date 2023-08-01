package things;

public class Operations {
	
	
	
public Operations() {
	System.out.println("This is No Argument constructor");
}
public int cal(String operation,int num1,int num2) {
	if(operation.equals("+")) {
		return num1+num2;
	}else if(operation.equals("-")) {
		return num1-num2;
	}else if(operation.equals("*")) {
		return num1*num2;
	}
	else if(operation.equals("/")) {
		return num1/num2;
	}
	else {
			System.out.println("Entre Correct Operators");
			return 0;
	}
	
	
}

}

