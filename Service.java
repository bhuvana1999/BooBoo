package com.service;

import java.util.Scanner;

import com.bean.Customer;
import com.dao.DAO;

public class Service {
Customer c;
DAO d=new DAO();
Scanner sc=new Scanner(System.in);
public void createAccount()
{
	System.out.println("enter your name");
	  String name=sc.next();
	  System.out.println("enter your Ph.no");
	  String mobno=sc.next();
	  System.out.println("enter your DOB");
	  String date=sc.next();
	  System.out.println("Enter your password");
	  String password=sc.next();
	  System.out.println("Enter the amount u want to deposite");
	  long balance=sc.nextLong();
	  long accno =8376941;
	  
	  c=new Customer(name,date,password,balance,mobno,accno);
	  c.setAccno(accno);
	  accno++;
	  c.setBalance(balance);
	  System.out.println(c);
	  System.out.println("Welcome "+name+" your account is created sucessfully");
	  System.out.println("your account no is "+accno);
	  System.out.println("Thankyou...!!!");  
}
public void showBalance()
{
	 System.out.println("enter your accno");
	  long accno =sc.nextLong();
	  if(d.getHash().containsKey(accno)) {
			System.out.println(d.getHash().get(accno));
		}
		else
			System.out.println("No such Account Number");

}
public void deposit()
{
	
}
 public void withdraw()
 {
	 
 }
 public void fundTransfer()
 {
	 
 }
 public void printTransaction()
 {
	 
 }
}
