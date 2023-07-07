//Write a Java program to calculate profit or loss.

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int cp,sp;
          System.out.println("enter cost price");
          cp=sc.nextInt();
          
          System.out.println("enter sellling price");
          sp=sc.nextInt();
          
          
          if(sp>cp){
                 System.out.println("PROFIT");
          }else{
                 System.out.println("loss");
          }  
     } 
  }
