package example;

public class Employee {
	String name;
	int id;
	long salary;
	String project;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e =new Employee();
		System.out.println(e.name);
		System.out.println(e.id);
		System.out.println(e.salary);
		
		Project p =new Project();
		System.out.println(p.id);
		System.out.println(p.clientname);

	}

}
