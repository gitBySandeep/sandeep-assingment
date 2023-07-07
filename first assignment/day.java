//change days in week,year,day;
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int n,month,week,day;
         System.out.print("enter number of days\t");
         n=sc.nextInt();
         month=n/30;
         n=n%30;
         week=n/7;
         n=n%7;
         day=n;
         System.out.println("no of month="+month);
         System.out.println("no of week="+week);
         System.out.print("no of day="+day);
     }
}
