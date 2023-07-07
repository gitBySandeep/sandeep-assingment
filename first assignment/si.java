//print simple interest
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int p,r,t;
         System.out.print("enter principal\t");
         p=sc.nextInt();
         System.out.print("enter rate\t");
         r=sc.nextInt();
         System.out.print("enter time\t");
         t=sc.nextInt();
                  
         float si=(p*r*t)/100f;
         System.out.println("Simple interest\t"+si);
         
     }
}                     
