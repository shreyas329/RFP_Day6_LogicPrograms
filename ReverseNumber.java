package LogicPrograms;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get it's reverse: ");
		int num = sc.nextInt();
		while(num>0)
		{
			int remainder = num % 10;
			reverse = (reverse * 10)+remainder;
			num = num/10;
		}
		System.out.println("The reversed number is: "+reverse);
	}

}
