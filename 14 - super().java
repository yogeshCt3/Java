/*
/	super
/		super()
/		super.varname
/		super.func()
*/	
import java.time.LocalDate;
class A{
	LocalDate d;
	String name;
	A(){
		name = "A";
		d = LocalDate.now();
	}
	void showData(){
		System.out.println(name + d);
	}
}
class B extends A{
	LocalDate d;
	String name;
	B(){
		super();// calling upper constructor
		d = super.d; // calling upper variable
		name = "B";
		
	}
	void showData(){
		super.showData(); // calling upper function
		System.out.println(name + d);
	}
}

class MainMethod{
	public static void main(String ... m){
		B obj = new B();
		obj.showData();
	}
}