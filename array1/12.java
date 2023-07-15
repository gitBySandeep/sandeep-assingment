//wap to search a particular number in given array and print its position
import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("enter number");
            a[i] = sc.nextInt();
        }

        System.out.print("enter number for compare");
        int b = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (a[i] == b) {
                System.out.println("found" + b + "number in index " + i);
            }
        }
    }
}
