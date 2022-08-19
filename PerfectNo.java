package LogicPrograms;
import java.util.*;
public class PerfectNo {

	public static void main(String[] args) {
		int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number to check perfect number: ");
        int n = s.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Given number is a Perfect number");
        }
        else
        {
            System.out.println("Given number is not a Perfect number");
        }    
    }

	}

