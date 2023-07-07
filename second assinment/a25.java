//WAP to calculate area of circle=pi*r*r; 
import java.util.Scanner;
class Test{
       public static void main(String []args){
          Scanner sc=new Scanner(System.in);
          float r,area ;
          System.out.println("enter radius ");
          r=sc.nextFloat();
        
          area =3.14f*r*r;
          System.out.println("area of circle= "+area);              
   }
}
