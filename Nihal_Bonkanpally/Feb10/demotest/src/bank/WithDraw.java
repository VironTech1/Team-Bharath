package bank;

public class WithDraw
{
 void wdraw(int amt,int bal){
     if(amt<bal)
     {
         System.out.println("amount withdraw:"+amt);
         System.out.println("balance amount:"+(bal-amt));
         System.out.println("Transaction completed");

     }
     else System.out.println("Insufficient fund in account");
 }
}
