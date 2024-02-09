package TrainingSet3;

import java.util.Scanner;

public class TablesTill {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<= 10;i++) {
			System.out.println("Below is "+i+" table: ");
			for(int j=1;j<=n;j++) {
				System.out.println(i+" * "+j+" = "+i*j);
			}
			
		}
		
	}

}
