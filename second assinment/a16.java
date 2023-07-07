/*. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/


import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n,n1,percentage;
          System.out.println("enter  number of class held ");
          n=sc.nextInt();
          System.out.println("enter  number of class attend ");
          n1=sc.nextInt();
          percentage=(n1*100)/n;
          System.out.println("percentage of attendence="+percentage);
         if(percentage>75){
               System.out.println("allowed to sit in exam");
             } 
         else {
               System.out.println("not allowed sit in exam");
           }
        }
 }       
