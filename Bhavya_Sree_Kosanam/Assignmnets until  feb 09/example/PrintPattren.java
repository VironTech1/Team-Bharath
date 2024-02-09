package example;

public class PrintPattren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;

        
        for (int i = 1; i <= numRows; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

	}

}
