package com.day2.assiment;


public class Registery extends HDFCbank {
	
public static void main(String[] args) {

	Registery res=new Registery();
	Customerdetails customer1=new Customerdetails(1234,"Balaji","SBI123");
	Customerdetails customer2=new Customerdetails(4321,"abu","HDFC321");

	
	res.savings_acc(customer1);
	res.current_acc(customer2);
	res.new_acc("velu",111122223333L);
}

}
