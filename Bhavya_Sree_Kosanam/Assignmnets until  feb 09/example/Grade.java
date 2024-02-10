package example;
import java.util.*;

public class Grade {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a First student score");
		int firstscore =s.nextInt();
		System.out.println("Enter a seconf student score");
		int secondscore =s.nextInt();
		System.out.println("Enter a Third student score");
		int thirdscore =s.nextInt();
		
		int score=(firstscore+secondscore+thirdscore)/3;
		
		if(score>=90) {
			System.out.println("Distint :"+score);
			
		}
		else if (score>80 && score<90) {
			System.out.println("First class :"+score);
		}
		else {
			System.out.println("second class :" +score);
			
		}
		

	}

}
