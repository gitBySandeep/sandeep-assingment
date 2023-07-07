
/* Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly*/
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          int c;
          System.out.println("you have medical cause to enter yes=y and no=n ");
          c=sc.next().charAt(0);
        
          if(c=='y'){
                    System.out.println("allow to sit");             
                   }
          else {
                System.out.println(" not allow to sit");
             }
   }
}
