//calculate percentage of student
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int p,c,m,h,e,pe;
          System.out.println("enter number of physics");
          p=sc.nextInt();
          System.out.println("enter number of chemistry");
          c=sc.nextInt();
          System.out.println("enter number of maths");
          m=sc.nextInt();
          System.out.println("enter number of hindi");
          h=sc.nextInt();
          System.out.println("enter number of english");
          e=sc.nextInt();
          
          pe=(p+c+m+h+e)/5;
          System.out.println("total percentage="+pe);
      }
 }      
