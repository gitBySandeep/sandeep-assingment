
import java.util.Scanner;
class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		for(i=1;i<=row;i++){
		System.out.print(i+" ");
			}
		int val=i;
        for(int j=1;j<i;j++){
        val=(j%2!=0)?val+(2*row+1-i)-1:val+(2*i-j);	
		