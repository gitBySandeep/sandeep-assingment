/*
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
*/
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int marks;
          System.out.println("enter marks ");
          marks=sc.nextInt();
       
          
         if(marks>80){
               System.out.println("Grade -A="+marks);
             }
         else if(marks>60&&marks<80){
               System.out.println("Grade -B"+marks);
          }
           else if(marks>50&&marks<60){
               System.out.println("Grade -C"+marks);
         } else if(marks>45&&marks<50){
               System.out.println("Grade -D"+marks);
         } else if(marks>25&&marks<45){
               System.out.println("Grade -E"+marks);
         } else {
               System.out.println("Grade -F"+marks);
         }
      } 
 }
