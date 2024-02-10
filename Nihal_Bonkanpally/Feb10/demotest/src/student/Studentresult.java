package student;

public class Studentresult
{
  float per;
  String result;
  void calculate(int tot,boolean pj)
  {
      per=(float)(tot/6);
      if(pj)
      {
        result="Fail";
      }
      else if((per>=70)&&(per<+100)) result="Destination";
      else if ((per>=60)&&(per<70)) result="Firstclass";
      else if ((per>=50)&&(per<60)) result="Secondclass";
      else if((per>=35)&&(per<50)) result="Thirdclass";
      else result="Fail";
      }
      void getResult(){
          System.out.println("Percentage: "+per);
          System.out.println("Result: "+result);
      }

  }



