package com.ui;

import java.util.Scanner;

import com.service.Service;

public class UI {
	public static void main(String[] args) {
		
		Service s=new Service();
		
		 System.out.println("1.Create account");
		  System.out.println("2.Show balance");
		  System.out.println("3.Deposit");
		  System.out.println("4.With draw");
		  System.out.println("5.Fund transfer");
		  System.out.println("6.Print Transaction");
		  
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter your choice");
		  int choice=sc.nextInt();
		 
		  switch(choice)
		  {
		case 1 : s.createAccount();
		break;
		case 2: s.showBalance();
		break;
		case 3: s.deposit();
		break;
		case 4: s.withdraw();
		break;
		case 5: s.fundTransfer();
		break;
	    case 6: s.printTransaction();
		break;
	    default :
		System.out.println("Enter the valid choice");

		 
	}
	}
}
