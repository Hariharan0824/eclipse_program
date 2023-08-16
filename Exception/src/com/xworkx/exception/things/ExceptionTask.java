package com.xworkx.exception.things;

public class ExceptionTask {
private String userName;
private String emailId;
public ExceptionTask(String userName, String emailId) {
	super();
	this.userName = userName;
	this.emailId = emailId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
@Override
public String toString() {
	return "Exception [userName=" + userName + ", emailId=" + emailId + "]";
}


	
}
