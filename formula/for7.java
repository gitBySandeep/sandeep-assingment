//7 WAP to print the series 1 4 9 16 25................n terms
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int i = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();

        while (i <= n) {
            System.out.println("i=" + (i * i));
            i++;
        }
    }
}