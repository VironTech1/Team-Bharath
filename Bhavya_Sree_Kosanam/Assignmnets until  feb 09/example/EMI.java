package example;

public class EMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amt=100000;
		int tenure=5;
		double rate = (amt/ 100) / 12;

    

		double emi=(amt*rate*Math.pow(1+rate, tenure))/(Math.pow(1+rate,tenure)-1);
		
		System.out.println("EMI :" +emi);
		

	}

}
