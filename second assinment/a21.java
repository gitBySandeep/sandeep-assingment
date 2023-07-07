/*
Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter  any number ");
          n=sc.nextInt();
          
          if(n==1){
                 System.out.println("sunday");
            }else if(n==2){
                 System.out.println("monday");
            } else if(n==3){
                 System.out.println("tuesday");
            } else if(n==4){
                 System.out.println("wednesday");
            } else if(n==5){
                 System.out.println("thusday");
            } else if(n==6){
                 System.out.println("friday");
            } else if(n==7){
                 System.out.println("saturday");
            } else {
                 System.out.println("default");
            }
   }
} 
