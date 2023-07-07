//print division
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         float p,c,m,h,e;
         System.out.print("enter number of physics\t ");
         p=sc.nextFloat();
         System.out.print("enter number of chemistry\t ");
         c=sc.nextFloat();
         System.out.print("enter number of maths\t ");
         m=sc.nextFloat();
         System.out.print("enter number of hindi\t ");
         h=sc.nextFloat();
         System.out.print("enter number of english\t ");
         e=sc.nextFloat();
         float per=(p+c+m+h+e)/5;
         System.out.println("total percentage\t "+per);
         
         if(per>60){
              System.out.println("first division");
         }else if(per>=50&&per<60) {
              System.out.println("second division");
         }else if(per>=33&&per<50) {
              System.out.println("third division");
         }else  {
              System.out.println("fourth division");
         }
    }
} 
