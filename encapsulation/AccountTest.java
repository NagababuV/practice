package encapsulation;

public class AccountTest {
	public static void main(String args[]) {
		Account a = new Account();
		
		System.out.println(a.getName());
	
		a.setAcc_num(375529221);
		a.setAmount(50000);
		a.setEmail("nagababu.vegisetti@gmail.com");
		a.setName("Nagababu Vegisetti");
		
		System.out.println(a.getAcc_num());
		System.out.println(a.getEmail());
		System.out.println(a.getName());
		System.out.println(a.getAmount());
		
	}
	

}
