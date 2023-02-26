package encapsulation;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String args[]) {
	
	BankAccount b = new BankAccount();

	b.setAccountNo("37722429221");
	b.setAccountBalance(500);
	b.setName("Nagababu Vegisetti");
	b.setEmail("nagababuvegisetti1313@gmail.com");
	b.setPhoneNumber(918270592);
	
	System.out.println(b.getName());
	System.out.println(b.getAccountNo());
	System.out.println(b.getEmail());
	System.out.println(b.getAccountBalance());
	System.out.println(b.getPhoneNumber());
	

	b.addFunds();

	b.withdrewFunds();
	
	
			
	
	
	
	}

	
	Scanner sc = new Scanner(System.in);
	
	
	

}
