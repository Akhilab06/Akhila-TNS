package com.tnsif.inheritance;

public class Student extends Citizen {
	private int roolno;
	private String collegename;
	public Student() {
		super();
		
	}
	public Student(String name, String address, long aadharno, long phoneno) {
		super(name,address,aadharno,phoneno);
		this.roolno = roolno;
		this.collegename = collegename;
	}
	public int getRoolno() {
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public Student(int roolno, String collegename) {
		super();
		this.roolno = roolno;
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Student [roolno=" + roolno + ", collegename=" + collegename + "]";
	}
	
	

}
