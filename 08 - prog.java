import java.util.*;
class Jv{
	int [] roundMarks(double [] marks){
		int n = marks.length;
		int [] rounded = new int[n];
		int i = 0;
		for(double m : marks){
			//System.out.println((int)m);
			rounded[i++] = ((int) m );


			if( m - ((double) rounded[i-1]) >= 0.5)
				rounded[i-1] += 1;
				 	
		}	
		return rounded;
	
	}
	
	public static void main(String ... k){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter number of subjects : ");
		n = sc.nextInt();
		double [] marks = new double[n];
		int i;
		for(i = 0; i < n ; i++){
			System.out.print("Enter Marks for " + (i+1) + " Subject : ");
			marks[i] = sc.nextDouble();
		}
		Jv obj = new Jv();
		int [] rounded = obj.roundMarks(marks);
		for(i = 0; i < n ; i++){
			System.out.println("Marks of Subject " + (i + 1 ) + " is : " + rounded[i] );
		}
	}
}