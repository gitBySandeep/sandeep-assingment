//lower case to upper case
//import java.util.Scanner;
class Test{
     public static void main(String []args){
         //Scanner sc=new Scanner(System.in);
         char uper='A',lower='b';
         int ascii;	
         ascii=uper+32;
         System.out.printf("%c charecter in lowercase is:%c\n\t",uper,ascii);
         ascii=lower-32;
         System.out.printf(" %c charecter in uppercase is:%c\n\t",lower,ascii);
     }
}
