/*11. Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".  
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int a,employee=0;
          System.out.println("enter  age ");
          a=sc.nextInt();
          
          
          System.out.println("enter sex m and f ");
          char c=sc.next().charAt(0);
          
          System.out.println("you have merital status yes=y and not=no ");
           char ms=sc.next().charAt(0);
          
          if(employee==c){
               System.out.println("she will work only in urban areas");
           } 
          if(employee==c) {
               if(a>20&&a<40)
               System.out.println("he work anywhere ");
           } 
           else if(a>40&&a<60){
               System.out.println("he work in urban areas ");
           }
           else{
               System.out.println("error"); 
        }
    }
}
