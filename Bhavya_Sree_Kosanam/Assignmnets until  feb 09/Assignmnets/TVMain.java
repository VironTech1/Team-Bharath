package Assignmnets;


import java.util.*;

public class TVMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		
		TV1 t=new TV1();
		
		System.out.println("Enter the values ");
		t.channel=s.nextInt();
		t.brand=s.next();
		t.color=s.next();
		t.decvolume=s.nextInt();
		t.incvolume=s.nextInt();
		t.channel=s.nextInt();
		
		
		t.changeChannel(t.channel);
		t.decreaseVolume(t.decvolume);
		t.increaseVolume(t.incvolume);
		
		

	}

}
