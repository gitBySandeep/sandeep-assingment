/*.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int marks;
          System.out.println("enter marks ");
          marks=sc.nextInt();
       
          
         if(marks>90){
               System.out.println("Grade -A="+marks);
          }
         else if(marks>80&&marks<=90){
               System.out.println("Grade -B="+marks);
         }
           else if(marks>60&&marks<80){
               System.out.println("Grade -C="+marks);
         } else {
               System.out.println("Grade -D="+marks);
         }
      } 
 }
