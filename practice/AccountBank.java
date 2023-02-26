package practice;

import java.util.Scanner;

public class AccountBank {
	private double accountNumber;
	private float balance=50;
	private  String customerName;
	private String email;
	private int phoneNumber;
	double updatedBalance=0;
	public double getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public double depositFunds() {
		System.out.println("Enter deposit amount : ");
		Scanner sc = new Scanner(System.in);
		
	double u =	sc.nextDouble();
       updatedBalance = balance + u;
		
		return updatedBalance;
		
		
	}
	
	public double withdrawFunds() {
		
		if(updatedBalance==0) {
			return 0;
			//return System.out.println("INSUFFICENT FUNDS_err");
		}
			System.out.println("Enter value for withdraw");
			Scanner s = new Scanner(System.in);
			
			
			double w = s.nextDouble();
			double remBalance = updatedBalance - w;
			
	
		return remBalance;
	}
	
	public static void main(String args[]) {
		AccountBank b = new AccountBank();
		System.out.println(b.depositFunds());
		System.out.println(b.withdrawFunds());
	}

}
