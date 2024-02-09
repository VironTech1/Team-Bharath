package example;

public class Test implements Runnable{	
	public void run() {
		int i=1;
		while(true) {
			System.out.println(i+"Hello");
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test m=new Test();
		Thread t= new Thread(m);
		t.start();
		int i=1;
		while(true) {
			System.out.println(i+"world");
			i++;
		}	

	}


}
