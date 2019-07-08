package com.bean;

public class Customer {
	private String name;
	private String DOB;
	private String password;
	private long balance;
	private String phno;
	private long accno;
	
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public Customer(String name, String dOB, String password, long balance, String phno,long accno) {
		super();
		this.name = name;
		DOB = dOB;
		this.password = password;
		this.balance = balance;
		this.phno = phno;
		this.accno=accno;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", DOB=" + DOB + ", password=" + password + ", balance=" + balance + ", phno="
				+ phno + ",accno= "+accno+"]";
	}
	
}
