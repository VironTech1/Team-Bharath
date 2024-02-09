package example;

public class Mobile {
	
	String Battery;
	String sim="Verizon";
	String screen="Rectangle";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile m=new Mobile();
		System.out.println(m.sim);
		System.out.println(m.screen);
		
		Battery b= new Battery();
		System.out.println(b.capacity);
		System.out.println(b.size);

	}

}
