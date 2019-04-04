class Outer{
	int x = 1;
	static int y = 2;
	class Inner{
		void show(){
			System.out.println(x + "" + y);
			class Temp{
				void showThis(){
					System.out.println(x);
				}
				
			}
			Temp i = new Temp();
				i.showThis();
		}
	}
	
	static class Nested{
		void print(){
			Outer o = new Outer();
			System.out.println(y);
			System.out.println(o.x);
		}
	}

}


class Demo{
	public static void main(String...s){
		Outer.Nested ob1 = new Outer.Nested();
		ob1.print();
		/////////////////////////////
		Outer ob2 = new Outer();
		Outer.Inner ob3 = ob2.new Inner();

		ob3.show();
		
	}
}