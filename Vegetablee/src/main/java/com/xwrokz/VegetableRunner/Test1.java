package com.xwrokz.VegetableRunner;

public class Test1 {

	public int date;
	public short noOfStudents;
	public byte noOfTest;
	public long marks;
	public float percentage;
	public double cutOff;
	public boolean values;
	public char certificate;
	public Test1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test1(int date, short noOfStudents, byte noOfTest, long marks, float percentage, double cutOff,
			boolean values, char certificate) {
		super();
		this.date = date;
		this.noOfStudents = noOfStudents;
		this.noOfTest = noOfTest;
		this.marks = marks;
		this.percentage = percentage;
		this.cutOff = cutOff;
		this.values = values;
		this.certificate = certificate;
	}
	@Override
	public String toString() {
		return "Test1 [date=" + date + ", noOfStudents=" + noOfStudents + ", noOfTest=" + noOfTest + ", marks=" + marks
				+ ", percentage=" + percentage + ", cutOff=" + cutOff + ", values=" + values + ", certificate="
				+ certificate + "]";
	}
	
	
	
}
