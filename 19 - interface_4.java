
///////////////////////////P A R T 1//////////////////////
abstract class A{
	abstract int add(int a, int b);
}


////////////////////////P A R T 2///////////////////////////////
interface X{
	abstract void test();
	default void demo(){
		System.out.println("Demo X");
	}	
	static void show(){
		System.out.println("Show X");
	}
}



/////////////////////////P A R T 3//////////////////////////////
interface Y{
	abstract void test();
	default void demo(){
		System.out.println("Demo Y");
	}
}

//////////////////////////I N  V O K E /////////////////////////////
class Z extends A implements X, Y{
	public int add(int a, int b){
		return (a+b);
	}
	public void test(){
		System.out.println("test");
	}
	public void demo(){
		X.super.demo();
		Y.super.demo();
		System.out.println("demo");
	}
	public static void main(String ... Y){
		Z o = new Z();
		int k = o.add(10, 20);
		o.demo();
		X.show();
	}
	
}