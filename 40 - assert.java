/*					
	Author » Yogesh K. Chhetri «	
*/
import java.util.Scanner;
class PI{
	static double roi;
	static int years, amt;
	public static void main(String ... lko){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount : ");
		amt = sc.nextInt();	
		System.out.print("Enter years : ");
		years = sc.nextInt();
		System.out.print("Enter rate of interest : ");
		roi = sc.nextDouble();
		System.out.print(calculateInterest(amt, roi, years));
	}
	public static double calculateInterest(int amt, double roi, int years){
		double calc;
		assert amt <= 0 : "Amount cannot be 0 or negative";

		assert roi > 0 : "rate of interest should be greater than 0 ";

		assert years <= 0 : "years cannot be -ve or zero.";

		calc = amt + (years*roi);
		return calc;
	}
}