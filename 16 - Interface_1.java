interface I1{
	int var1 = 10;
	void abs1(); // abstract + public
	static void demo1(){
		// public and abstract
		System.out.println("Demo1 of I1 Interface");
	}
	default void demo2(){
		// static and public
		System.out.println("Demo2 of I1 Interface");
	}
}

interface I2{
	int var2 = 20;
	void abs2(); // abstract + public
	static void demo4(){
		System.out.println("Demo4 of I2 Interface");
		// public and abstract
	}
	default void demo3(){
		//static and public
		System.out.println("Demo3 of I2 Interface");
	}
}

class Base{
		
}

abstract class Derived extends Base implements I1, I2{
	public static void main(String...k){
		I2.demo4();
	}
}