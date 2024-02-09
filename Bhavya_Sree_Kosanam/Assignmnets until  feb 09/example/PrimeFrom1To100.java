package example;

public class PrimeFrom1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false; 
            } 
            else {
            	
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false; 
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

	}

}
