import java.util.Scanner;
class Greater{
      public static void main(String[]args){
          Scanner sc=new Scanner(System.in);
          char ch;
          System.out.print("enter charecter\t");
          ch=sc.next().charAt(0);
          
          if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
             System.out.println("this  is alphabet");
          }else{
              System.out.println("not a alphabet");
          }
     }
}           
