/*					
	Author » Yogesh K. Chhetri «	
*/					
class ExceptionPropogation{
	void a(){	
		System.out.println("Inside A.");
		int a = 10, b = 0;
		int c = a / b;	// Exception
	}
	void b(){
		System.out.println("Inside B.");
		a();
	}
	void c(){
		System.out.println("Inside C.");
		try{
			b();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Caught Exception");
		}
	}
}

class Demo{
	public static void main(String ... lko){
		ExceptionPropogation ep = new ExceptionPropogation();
		ep.c();
	}
}