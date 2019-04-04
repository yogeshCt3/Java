import java.util.Scanner;
class Marks{
	public static void main(String ... y){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Subjects : ");
		int n = sc.nextInt();
		int i, j;
		double marks[][] = new double [n][];
		String name[] = new String [n];
		double total[] = new double[n];
		for(i = 0; i < n ; i++){
			System.out.print("Details for " + (i + 1 ) + '\n');
			System.out.print("Enter Name of Subject : ");
			name[i] = sc.next();
			System.out.print("Enter number of CA : ");
			j = sc.nextInt();
			marks[i] = new double [j];
			total[i] = 0;
			for( j = 0 ; j < marks[i].length ; j ++){
				System.out.print("Enter Marks for CA" + (j+1) + " : ");
				marks[i][j] = sc.nextDouble();
				total[i] += marks[i][j];
			}	
		}
		for(i = 0 ; i < n ; i ++){
			System.out.print(name[i] + '\n' + "Total = " + total[i] + "\nAverage = " + (total[i] / marks[i].length) + "\n______________________________\n");
			
		}
		
	}
}