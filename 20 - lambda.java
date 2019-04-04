interface One{
	void add(int a, int b, int c);
}
interface Two{
	int check(String s, char c);
}

class Lab{
	public static void main(String ... k){
		One o1 = (int a, int b, int c) -> {System.out.println((a+b+c));	};
		Two o2 = (String s, char c) -> {
			int cn = 0;
			int l = s.length();
			for(int i = 0; i < l ; i++){
				if(s.charAt(i) == c)
					cn ++;
			}
			return cn;
		};
		o1.add(10, 20, 30);
		System.out.print(o2.check("thisissparta", 's'));
		
	}
}