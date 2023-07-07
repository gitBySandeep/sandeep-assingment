//print grade
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int p,c,m,h,e;
         System.out.print("enter number of physics\t");
         p=sc.nextInt();
         System.out.print("enter number of chemistry\t");
         c=sc.nextInt();
         System.out.print("enter number of maths");
         m=sc.nextInt();
         System.out.print("enter number of hindi");
         h=sc.nextInt();
         System.out.print("enter number of english");
         e=sc.nextInt();
         float x=(p+c+m+h+e)/5;
         System.out.println("total percentage"+x);
         String a=(x>60)?("first Division"):(x>50)?("second Division"):(x>33)?("third Division"):("failed");
         System.out.println(a);  
         
     }
}                     
