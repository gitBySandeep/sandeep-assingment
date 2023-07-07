//change height inch to centimeter
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int inch;
         System.out.print("enter height in inches\t");
         inch=sc.nextInt();
         float c=2.54f*inch;
         System.out.print("height in centimeter=\t"+c);
     }
}
