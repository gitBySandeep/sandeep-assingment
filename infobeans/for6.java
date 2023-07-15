//WAP to print the series 2 4 6 8 10..................n terms 
import java.util.Scanner;
class Test {
  public static void main(String[] args) {
    int i = 2;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    n = sc.nextInt();

    while (n != 0) {
      System.out.println("i=" + i);
      i = i + 2;
      n--;
    }
  }
}