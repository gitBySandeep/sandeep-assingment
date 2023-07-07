/*W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit. For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          char ch;
          float temp;
          System.out.println("enter  any charecter  ");
          ch=sc.next().charAt(0);
          System.out.println("enter  tempreture  ");
          temp=sc.nextFloat();
          float feh=0;
          if(ch=='c'||ch=='C'){
                float cel=(temp-32)*5/9f;
                System.out.println("change temp feh to celcius "+cel);
            } 
             else {
                   feh =(temp*9/5f)+32;
                 System.out.println("change temp celcius to feh "+feh);
             }
       }
   }    
