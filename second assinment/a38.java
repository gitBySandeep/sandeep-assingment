//W.A.P to check whether a charachter is an alphabet or not.

import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          char ch;
          System.out.println("enter charecter");
          ch=sc.next().charAt(0);
             
          if((ch>'A'&&ch<'Z')&&(ch>'a'&&ch<'z'))
            {  
            System.out.println("its alphabet");
            } 
        else{
            System.out.println("its alphabet");
            }
     }     
    }

    
