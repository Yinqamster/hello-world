package problem2_6;
import java.util.Scanner;

public class SumOfNum {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000:");
		//input the number
		int num = scanner.nextInt();
//		System.out.println(num);
		
		System.out.println("The sum of the digits is " + sum(num));
		
		scanner.close();
	}
	
	//compute the sum of the digits
	public static int sum(int num) {
		int result = 0;
		while(num > 0) {
			result += num%10;
			num = num / 10;
		}
		return result;
	}
}
