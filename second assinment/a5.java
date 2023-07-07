//print division
import java.util.Scanner;
class Smallest{
      public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         char ch;
         System.out.print("enter first any charecter in lower case\t ");
         ch=sc.next().charAt(0);
         
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
              System.out.println("its vowel=\t"+ch);
         }
         else{
              System.out.println("its constant\t"+ch);
         }
     }
} 
