package LogicPrograms;
import java.util.*;

public class CouponNumber {
	public static int numberOfCoupons;
    public static ArrayList<Integer> arrayOfCouponNumbers = new ArrayList<Integer>();
    public static int totalRandomNumbers = 0;

    public static int generateRandomNumbers() {
        return (int) Math.floor(Math.random() * 100 ) % numberOfCoupons;
    }

    public static void generateDistinctCoupons(int numberOfCoupons) {

        while (arrayOfCouponNumbers.size() != numberOfCoupons) {
            int randomNumber = generateRandomNumbers();
            if (arrayOfCouponNumbers.contains(randomNumber)) {
                totalRandomNumbers++;
            } else {
                totalRandomNumbers++;
                arrayOfCouponNumbers.add(randomNumber);
            }
        }
        for (int index = 0 ; index < arrayOfCouponNumbers.size() ; index++) {
            System.out.println(arrayOfCouponNumbers.get(index));
        }
        System.out.println("The total numbers of random Numbers generated are : " + totalRandomNumbers);
    }

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the number of distinct coupon numbers needed:");
        numberOfCoupons = scannerObject.nextInt();
     
        generateDistinctCoupons(numberOfCoupons);

	}

}
