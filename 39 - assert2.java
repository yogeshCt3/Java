/*					
	Author » Yogesh K. Chhetri «	
*/
class ADemo{
	//static int arr [] = new int [0];
	static int arr [];
	public static void main(String ... lko){
		assert arr != null : "Array is NULL";
		showAverage(arr);
	}
	public static void showAverage(int [] arr){
		int sum = 0;
		for(int a : arr)
			sum += a;
		assert arr.length != 0 : "Length of array is 0";
		System.out.println("Average is " + sum / arr.length);
	}
}