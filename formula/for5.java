// WAP to print the series 1 3 5 7 9....................n terms 
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int i = 1;
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