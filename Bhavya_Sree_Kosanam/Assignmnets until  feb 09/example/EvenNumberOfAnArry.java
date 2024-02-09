package example;

public class EvenNumberOfAnArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,29,34,67,99};
		
		
		for(int i=0;i<a.length;i++) {
			 
			if(a[i] % 2 == 0) {
				
				System.out.println("Even Number:"+ a[i]);
				
			}
			else {
				System.out.println("ODD Number:"+ a[i]);
			}
			
		}
		

	}

}
