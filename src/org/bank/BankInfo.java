package org.bank;

public class BankInfo extends AxisBank {
	public void savings() {
		// TODO Auto-generated method stub
        System.out.println("saving acc no is 887799778878");
	}
	public void fixed() {
		System.out.println("fixed deposite amount");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		BankInfo a = new BankInfo ();
	    a.savings();
		a.fixed();
		a.deposit();
		
	}
	

}
