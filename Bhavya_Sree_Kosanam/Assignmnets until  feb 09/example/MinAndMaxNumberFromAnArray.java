package example;

public class MinAndMaxNumberFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
			}
			else if(a[i]<min){
				
				min=a[i];
				
				
			}
			
		}
		System.out.println("maximum element"+max);
		System.out.println("minimum elemnet"+ min);

	}
	
	}


