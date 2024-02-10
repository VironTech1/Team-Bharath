package feb;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a password");
		
		String pwd=s.nextLine();
		int ch;
		boolean b=false;
		
		for(int i=0;i<=pwd.length()-1;i++) {
			
			ch=pwd.charAt(i);
			
			if((ch >=65 && ch<=90) && (ch>=32 && ch<=126) ){
				
				b=true;
				
			}
		}
			if(b==true)
			{
				System.out.println("password is strong");
			}
			else {
				System.out.println("Password is not strong");
			}

	}

}
