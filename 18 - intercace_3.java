interface A{
	void demo();
}
class B implements A{
	public void demo(){
		System.out.println("Hello");
	}
}
class Aa{
	void call (A ob){
		System.out.println("Inside call");
	}
}

class Bb{
	public static void main(String ... k){
		Aa obj = new Aa();
		B ob = new B();
		obj.call(ob);
	}

}