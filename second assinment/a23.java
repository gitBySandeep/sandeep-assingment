/*. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%			  
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int cp;
          System.out.println("enter costprice of bike ");
          cp=sc.nextInt();
        
          if(cp>100000){
                    System.out.println("price with 15% tax"+(cp+(cp*15)/100));             
                }
                    if(cp>50000&&cp<=100000){
                    System.out.println("price with 10% tax"+(cp+(cp*10)/100));             
                }   else if(cp<=50000){
                    System.out.println("price with 5% tax"+(cp+(cp*5)/100));             
                }
        }
   }
