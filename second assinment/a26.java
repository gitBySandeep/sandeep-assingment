//WAP to calculate area of rectangle

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          float length,breath,area ;
          System.out.println("enter length ");
          length=sc.nextFloat();
          System.out.println("enter breath ");
          breath=sc.nextFloat();
          area =length*breath;
          System.out.println("area of rectangle= "+area);              
   }
}
