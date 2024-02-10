package student;

public class EmployeeContact
{
    String email;
    long phone;
   public EmployeeContact(String email1,long phone1)
  {
      email=email1;
      phone=phone1;

  }
    public void getEmployeeContact(){
        System.out.println("=======Employee Contact=======");
       System.out.println("Employee's email id is:"+email);
       System.out.println("Employee's phone number is"+phone);

   }

}
