package student;



public class EmployeeData
{
    String eid1,ename2,edis;
  public EmployeeData(String eid, String ename, String eDesignation){
    eid1=eid;
    ename2=ename;
    edis=eDesignation;

  }
  public void getemployeeData(){
      System.out.println("=======Employee Data=======");
      System.out.println("Employee id is:"+eid1);
      System.out.println("Employee name is:"+ename2);
      System.out.println("Employee designation is:"+edis);
  }
}
