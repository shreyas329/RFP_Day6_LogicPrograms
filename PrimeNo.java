package LogicPrograms;
import java.util.*;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check prime number: ");
		int num = sc.nextInt();
		boolean flag = false;
		for(int i=2; i<num/2; ++i)
		{
			if (num%i == 0)
			{
				flag =true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("The number "+num+" is a prime number.");
		}
		else
		{
			System.out.println("The number "+num+" is not a prime n umber.");
		}

	}

}
