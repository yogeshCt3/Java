
interface One{
	boolean isPrime(int x);
}
interface Two{
	int getAverage(int x, int y, int z);
}

interface Three{
	void show(int x, int y, double z);
}
class Lab{
	public static void main(String ... k){
		One o1 = x -> {
				if(x <= 2)
					return true;
				for( int i = 2 ; i <= Math.sqrt(x) ; i++){
					if(x % i == 0)
						return false;
				}
				return true;
			};
		
		Two o2 = (int x, int y, int z) -> ((x+y+z) / 3 ) ;/*{
			can be optimized as
			return ( (x+y+z) / 3);
		};*/
	
		Three o3 = (int x, int y, double z) ->{
			System.out.println((x   + y  + z));
		};
		for(int i = 0; i <= 20 ;i++)
			System.out.println(o1.isPrime(i) + "\t\t:\t" + i);
		o3.show(4, 5, 9.2);
		System.out.println(o2.getAverage(3, 6, 2));
	}
}