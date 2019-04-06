import java.util.*;
class Demo{
	void arithmeticException(){
		int a = 10 , b = 0, c;
		try{
			c = a / b;
		}		
		catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
	void arrayIndexOutOfBoundsException(){
		int [] arr = new int[10];
		try{
			System.out.println(arr[21]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}
	void nullPointerException(){
		ArrayList<Integer> arr = new ArrayList<Integer>(10);
		try{
			System.out.println(arr.get(0));
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
	}
	public static void main(String ... lko){
		Demo d = new Demo();
		d.arithmeticException();
		d.arrayIndexOutOfBoundsException();
		d.nullPointerException();
	}
}