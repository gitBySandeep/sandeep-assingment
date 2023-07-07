/*Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n;
          System.out.println("enter any number ");
          n=sc.nextInt();
          
         if(n>0){
               System.out.println("absolute value="+n);
             } 
         else if(n<0){
               System.out.println("absolute value="+(n*-1));
           }
        }
 }       
