
interface One{
	int sum (int a, int b);
	double divide (int x, int y);
}

class Lab implements One{
	public int sum(int a, int b){	return a+b;}
	public double divide (int x, int y){ return ((double) x+y);}
	public static void main(String ... k){
		One obj = new Lab();
		
	}
}