
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          char c;
          System.out.println("enter  any charecter in lowercase ");
          c=sc.next().charAt(0);
          
          switch(c){
           case'a':
             
             System.out.println(" a is vowel ");
             
           break;
           case'e':
             
             System.out.println(" e is vowel ");
           break;
             
           case 'i': 
             
             System.out.println(" i is vowel ");
             
           break;
           case'o': 
             
             System.out.println(" o is vowel ");
             
           break;
           case'u':
             System.out.println(" u is vowel ");
            break;
            
            default:
             
             System.out.println(" default ");
             
                   
    }
 }
 }
