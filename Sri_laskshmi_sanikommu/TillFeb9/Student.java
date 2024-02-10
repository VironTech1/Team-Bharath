public class Student {
    int studentId;
    String studentName;
    String email;
    long phone;
    Address address;
}

class Address{
    String addressline1;
    String addressline2;
    String city;
    String state;
    long zipcode;
}

class StudentMain {

  public static void main(String[] args) {
     
    Student stu1 = new Student();
    Address add1 = new Address();

    stu1.studentId = 1001;
    stu1.studentName = "Sam";
    stu1.email = "sam@gmail.com";
    stu1.phone = 1234567890;
    add1.addressline1 = "923 w university Ave";
    add1.addressline2 = "4-117";
    add1.city = "Flagstaff";
    add1.state = "Arizona";
    add1.zipcode = 86001;
    stu1.address = add1;

    System.out.println("Id is: " + stu1.studentId);
    System.out.println("Student Name is: " + stu1.studentName);
    System.out.println("Student Email is: " + stu1.email);
    System.out.println("Phone is: " + stu1.phone);
    System.out.println("Address: "+stu1.address.addressline1+" "+stu1.address.addressline2+" "+stu1.address.city+" "+stu1.address.state+" "+stu1.address.zipcode);
    System.out.println("****************************************************************************************");

    Student stu2 = new Student();
    Address add2 = new Address();

    stu2.studentId = 1002;
    stu2.studentName = "Ram";
    stu2.email = "ram@gmail.com";
    stu2.phone = 987654321;
    add2.addressline1 = "800 w forest medows st";
    add2.addressline2 = "195";
    add2.city = "Flagstaff";
    add2.state = "Arizona";
    add2.zipcode = 86001;
    stu2.address = add2;

    System.out.println("Id is: " + stu2.studentId);
    System.out.println("Student Name is: " + stu2.studentName);
    System.out.println("Student Email is: " + stu2.email);
    System.out.println("Phone is: " + stu2.phone);
    System.out.println("Address: "+stu2.address.addressline1+" "+stu2.address.addressline2+" "+stu2.address.city+" "+stu2.address.state+" "+stu2.address.zipcode);
    System.out.println("****************************************************************************************");

    Student stu3 = stu1;

    System.out.println("Id is: " + stu3.studentId);
    System.out.println("Student Name is: " + stu3.studentName);
    System.out.println("Student Email is: " + stu3.email);
    System.out.println("Phone is: " + stu3.phone);
    System.out.println("Address: "+stu3.address.addressline1+" "+stu3.address.addressline2+" "+stu3.address.city+" "+stu3.address.state+" "+stu3.address.zipcode);
    System.out.println("****************************************************************************************");

    System.out.println(stu1);
    System.out.println(stu2);
    System.out.println(stu3);


    }
    
}