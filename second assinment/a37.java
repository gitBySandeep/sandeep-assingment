/*W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides.*/
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int s1,s2,s3;
          System.out.println("enter  first side ");
          s1=sc.nextInt();
          System.out.println("enter  second side ");
          s2=sc.nextInt();
          System.out.println("enter  third side ");
          s3=sc.nextInt();
          
          if(s1==s2&&s2==s3&&s1==s3)
          {
                System.out.println("equilateral triangle");
           } 
        else if(s1==s2||s2==s3||s1==s3)
        {
          System.out.println("isosceles triangle");
        } 
        else if(s1!=s2&&s2!=s3&&s1!=s3){
                System.out.println("scalene triangle");
            } 
       }
   }
    
