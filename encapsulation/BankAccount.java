package encapsulation;

import java.util.Scanner;

public class BankAccount {
	private String accountNo;
	private float accountBalance;
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	private String name;
	private String email;
	private double phoneNumber;
	
//	private float currentBalance;
	
	public void withdrewFunds() {
		
		System.out.println("Enter amount for withdrew");
		Scanner sc = new Scanner(System.in);
		float withdrew = sc.nextFloat();
		
		
		if(accountBalance-withdrew <0) {
			
			System.out.println("Not Enough funds in your account...");
		}
		else {
		accountBalance -=withdrew; //ab= ab-w
			
		System.out.println(accountBalance);
		}
	}
	
	public void addFunds() {
		
		System.out.println("Enter amount for deposit");
		Scanner sc = new Scanner(System.in);
		float addFund = sc.nextFloat();
		
		
	accountBalance += addFund;
	
	System.out.println(accountBalance);
		
		
	}
	

	

}
