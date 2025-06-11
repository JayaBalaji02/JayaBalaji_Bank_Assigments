package com.day2.assiment;


class HDFCbank implements AccountTypes {

	public void savings_acc(Customerdetails customer_details) {
	String accStr=	String.valueOf(customer_details.getAccount_num());
	   if(accStr.contains("1234")) {
		   System.out.println("Hi "+customer_details.getAccount_name()
		   +" your balancy in savings account is RS.2000");
	   }
		
	}

	public void current_acc(Customerdetails customer_details) {
		
		if(customer_details.getIFCcode().contains("HDFC")) {
			System.out.println("Hi "+customer_details.getAccount_name()
			+" your balance in current account is RS.5000");
		}
		
	}

	public void new_acc(String name, long addharnum) {
		Long check=Long.valueOf(addharnum);
		String check2=check.toString();
		if(!name.isEmpty()&& addharnum!=0 && check2.length()==12) {
			long accNum=1000000000L +(long)(Math.random()*9000000000L);
			long ifs4digit=1000L+(long)(Math.random()*9000);
			
			String ifsccode="HDFC"+ifs4digit;
			System.out.println("Hi "+name+" new user your account number is "+
					accNum	+" your IFSC code is "+ifsccode);	
			
			
		}else {
			System.out.println("Please check the addhar number ");
		}
	}

	

	
}
