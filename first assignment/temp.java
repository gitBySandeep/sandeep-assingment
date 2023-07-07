//ferhenhite to celcius
import java.util.Scanner;
class Test{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         float feh,cel;
         System.out.println("enter tempreture in ferhenhite");
         feh=sc.nextInt();
         cel=(feh-32)*5/9;   
         System.out.println("temprere in celcius"+cel);
     }
}                                    
