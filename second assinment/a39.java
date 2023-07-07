/*Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int t1,t2,t3;
          System.out.println("enter first triangle");
          t1=sc.nextInt();
          
          System.out.println("enter second triangle");
          t2=sc.nextInt();
          
          System.out.println("enter third triangle");
          t3=sc.nextInt();   
         
          
          if((t1+t2+t3)==180){
                System.out.println("valid triangle");
             }
          else
             {
            System.out.println("not a triangle");
            }
    }
}            
