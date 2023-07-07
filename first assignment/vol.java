//volume of cylinder=pi*r*r*h;
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         int r,h;
         System.out.print("enter radius of cylinder\t");
         r=sc.nextInt();
         System.out.print("enter height of cylinder\t");
         h=sc.nextInt();
         float c=3.14*r*r*h;
         System.out.print("volume of cylinder=\t"+c);
     }
}
