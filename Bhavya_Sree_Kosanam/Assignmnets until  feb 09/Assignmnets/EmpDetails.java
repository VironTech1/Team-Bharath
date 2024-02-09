package Assignmnets;



public class EmpDetails {
	
	int empid=123;
	String empname="Bhavya";
	long salary=1234567;
	String address="New york";
	char gender='F';
	
	
	void getDetails() {
		
		System.out.println("Enter the empid "+empid+"\n Enter the ename "+empname+"\n Enter the Salary "+salary+"\n Enter the Address "+address+"\n Enter the gender "+gender);
		
	}
	

}

class Developer extends EmpDetails{
	
	
	int nooferror=10;
	int nooflines=700;
	
	
	
	void getCode() {
		
		System.out.println("Enter the no.of lines in the code "+nooflines);
	}
	
	
	void getError() {
		
		System.out.println("Enter the no.of errors in the code "+nooferror);
	}
	
	
}


class Tester extends Developer {
	
	
	int nooflinesdebug=20;
	
	void getCode() {
		
		System.out.println("Enter the no.of lines to be executed after debugging "+nooflinesdebug);
	}
	
	
	
}
	