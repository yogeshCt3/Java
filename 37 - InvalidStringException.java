/*					
	Author » Yogesh K. Chhetri «	
*/
import java.util.Scanner;			
class InvalidStringException extends Exception{
	InvalidStringException(){
		super("String Length is less than 5");
	}
}
class User{
	public static void main(String ... lko) throws InvalidStringException{
		Scanner sc = new Scanner(System.in);	
		System.out.print("Enter a String : ");
		String s = sc.next();
		try{
			if(s.length() < 5)
				throw new InvalidStringException();
		}
		catch(InvalidStringException e){
			e.printStackTrace();
			try{
				
				System.out.print("Enter Again : ");
				s = sc.next();
				throw e;
			}
			catch(Exception e2){
				while(s.length() < 5){
					e2.printStackTrace();
					System.out.print("Enter Again : ");
					s = sc.next();
				}
			}

		}
		finally{
			System.out.println("Thanks for Entering correct text.\nDone!");
		}
		
	}
}		
