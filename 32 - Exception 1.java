import java.util.*;
class Demo{
	static Scanner sc = new Scanner(System.in);
	public static void main(String ... lko){
		int a = 0, b = 0;
		try{
			a = Integer.parseInt(lko[0]);
			b = Integer.parseInt(lko[1]);
		}
		catch(ArrayIndexOutOfBoundsException  | NumberFormatException e){
			int flag = 0;
			while(flag == 0){
				try{
					System.out.print("Enter two Numbers: ");
					a = sc.nextInt();
					b = sc.nextInt();
					flag = 1;
				}
				catch(Exception l){
					flag = 0;
				}
				// Dummy Section to avoid the '\n' as the input
				if(flag == 0){
					System.out.println("Invalid Integers. Enter Again.");
					sc.next();
				}
			}
			
		}
		add(a, b);
		divide(a, b);
		subtract(a, b);		
	}
	static void add(int a, int b){
		System.out.println( a + " + " + b +  " : " + (a+b));
	  
	}
	static void subtract(int a, int b){
		System.out.println( a + " - " + b +  " : " + (a-b));
	  
	}
	static void divide(int a, int b){
		try{
			System.out.println( a + " / " + b +  " : " + (a/b));
		}
		catch(Exception e ){
			System.out.println("Division with ZERO is not allowed !");			
		}
	  
	}

}