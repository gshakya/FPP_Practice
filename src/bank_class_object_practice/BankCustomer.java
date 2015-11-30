package bank_class_object_practice;

import java.util.Random;

public class BankCustomer {
	private String name;
	private final String accountId;
	private double balance;
	private String address;

	BankCustomer() {
		// TODO Auto-generated constructor stub
		Random randBuffer = new Random();
		int accNo = randBuffer.nextInt(1000);
		if (accNo < 100)
			accNo = accNo + 100;
		this.accountId = Integer.toString(accNo);

		balance = 0;
	}

	BankCustomer(String _name, String _address) {
		Random randBuffer = new Random();
		this.name = _name;
		this.address = _address;
		int accNo = randBuffer.nextInt(1000);
		if (accNo < 100)
			accNo = accNo + 100;
		this.accountId = Integer.toString(accNo);
		balance = 0;
	}

	BankCustomer(String _name, String _address, double _balance) {
		Random randBuffer = new Random();
		this.name = _name;
		this.address = _address;
		this.balance = _balance;
		int accNo = randBuffer.nextInt(1000);
		if (accNo < 100)
			accNo = accNo + 100;
		this.accountId = Integer.toString(accNo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Name Initialzed: " + name);
	}

	public String getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
		System.out.println("Balance Set:" + balance);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		System.out.println("Address Set:" + address);
	}

	public void depositAmount(double amt) {
		balance = balance + amt;
		System.out.println("Amount " + amt + " deposited");
		System.out.println("Current Balance: " + balance);
	}

	public void withDrawAmount(double amt) {
		if (amt > balance) {
			System.out.println("Balance not Sufficient");
		} else {
			balance = balance - amt;
			System.out.println("Amount " + amt + " withdrawn");
			System.out.println("Current Balance: " + balance);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCustomer c1 = new BankCustomer();
		System.out.println("AccountNo: " + c1.getAccountId());

		c1.setName("Gunjan");
		c1.setAddress("Nepal");
		c1.setBalance(1000);
		c1.depositAmount(100.34);
		c1.withDrawAmount(1200);
		c1.withDrawAmount(1000);
		
		
		BankCustomer c2 = new BankCustomer("Prabhat","Kathmandu");
		System.out.println("Account Holder Name: "+ c2.getName());
		System.out.println("Current Balance: "+ c2.getBalance());
		c2.depositAmount(2000);
		System.out.println("Current Balance: "+ c2.getBalance());
	}
}
