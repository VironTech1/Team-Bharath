package student;


public class EmployeeAddress
{
 String hNo,sName,city,pinCode;
 public EmployeeAddress(String hn,String sn,String cit,String pcode){
     hNo=hn;
     sName=sn;
     city=cit;
     pinCode=pcode;
 }
 public void getemployeeAdd(){
     System.out.println("=======Employee Address=======");
     System.out.println("Employee house number is:"+hNo);
     System.out.println("Employee Street name is:"+sName);
     System.out.println("Employee city name is:"+city);
     System.out.println("Employee pincode number is:"+pinCode);

 }
}
