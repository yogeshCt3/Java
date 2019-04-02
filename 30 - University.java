
import java.util.*;
interface University{
	class Student{
		String name;
		double ca_marks;
		double getCaMarks(){
			return ca_marks;

		}
		
		String getName(){
			return name;
		}
		Student(){
			System.out.print("\nEnter name : ");
			Scanner sc = new Scanner(System.in);
			name = sc.next();
		}
		void study(){
			class Evaluation{
				
				double getEvaluationMarks(){
					Scanner sc = new Scanner(System.in);
					System.out.print("Enter number of Questions : ");
					double total = sc.nextInt();
					System.out.print("Enter number of incorrect answers  : ");
					double wrong = sc.nextInt();
					return (( ( total - wrong) / total ) * 100.0);
				}
				
				
			}
			Evaluation o = new Evaluation();
			ca_marks = o.getEvaluationMarks();
			System.out.print("Ca Marks : " + ca_marks);
		}
	}
}


class Caller{
	public static void main(String ... ykc){
		System.out.println("\nStudent 1");
		University.Student s1 = new University.Student();
		s1.study();
		
		System.out.println("\nStudent 2");
		University.Student s2  = new University.Student();
		s2.study();
		

		System.out.println("\nStudent 3");
		University.Student s3 = new University.Student();
		s3.study();
			
	
		double high = s1.getCaMarks();

		if(s2.getCaMarks() > high)
			high = s2.getCaMarks();

		if(s3.getCaMarks() > high)
			high = s3.getCaMarks();
	
		
		System.out.println("\n\n\nHighest Marks = " + high + "\nName with Highest Marks : ");
		if(high == s1.getCaMarks())
			System.out.println(s1.getName());
		if(high == s2.getCaMarks())
			System.out.println(s2.getName());
		if(high == s3.getCaMarks())
			System.out.println(s3.getName());

		
	}

}



