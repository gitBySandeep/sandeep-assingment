//Take input of age of 3 people by user and determine oldest and youngest among them.//

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int a1,a2,a3;
          System.out.println("enter age of first person ");
          a1=sc.nextInt();
          System.out.println("enter age of second person ");
          a2=sc.nextInt();
          System.out.println("enter age of third person ");
          a3=sc.nextInt();
          
         if(a1>a2&&a1>a3){
               System.out.println("a1 is oldest");
             } 
              else if(a2>a1&&a2>a3){
               System.out.println("a2 is oldest");
             }
              else {
               System.out.println("a3 is oldest");
            }
            if(a1<a2&&a1<a3){
               System.out.println("a1 is youngest");
               }
              else if(a2<a1&&a2<a3){
               System.out.println("a2 is youngest");
               }else {
               System.out.println("a3 is youngest");
              }
      } 
 }
