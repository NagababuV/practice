package practice;

public class VipCustomer {
	private String name;
	private int creditLimit;
	private String email;
	public String getName() {
		return name;
	}
	
	public int getCreditLimit() {
		return creditLimit;
	}
	
	public String getEmail() {
		return email;
	}

	public VipCustomer() {
		this("Default name",5,"default@email.com");
		
	}
	public VipCustomer(String name, int creditLimit) {
		
		this(name,creditLimit,"unknown@email.com");
	}

	public VipCustomer(String name, int creditLimit, String email) {
	
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	
	
	public static void main(String args[]) {
		
		VipCustomer v1  = new VipCustomer();
		System.out.println(v1.getName());
		
		
	
	VipCustomer v2  = new VipCustomer("Bob",25);
	System.out.println(v2.getName());
	
	

      VipCustomer v3  = new VipCustomer("Tim",1000,"tim@email.com");
      System.out.println(v3.getName());
      System.out.println(v3.getEmail());


}
	


}
