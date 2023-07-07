/*2.A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895 
*/

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int n,rem,rev=0;
          System.out.println("enter  any number ");
          n=sc.nextInt();
          
          rem=n%10;//123 = 3
          n=n/10; // 12
          rev=10*rev+rem; // 3
          rem=n%10; //12 =2 
          n=n/10;
          rev=10*rev+rem; //32
          rem=n%10; //1
          n=n/10;
          rem=n%10;
          n=n/10;
          rev=10*rev+rem;
         
          rev=10*rev+rem;
        
          
          System.out.println("reverse number="+rev);
      }
 }
