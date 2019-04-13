/*					
	Author » Yogesh K. Chhetri «	
*/
import java.util.*;
class Student implements Comparable<Student>{
	public int compareTo(Student s){
		return this.cgpa.compareTo(s.cgpa);
	}
	String name;
	Integer id;
	Double cgpa;
	Student(String s, Integer i, Double d){
		name = s;
		id = i;
		cgpa = d;
	}
}
class Demo{
	public static void main(String...lko){
		TreeSet<Student> ts = new TreeSet<>(
			(x, y) -> {
				if(x.cgpa.compareTo(y.cgpa) == 0){
					if(x.name.compareTo(y.name) == 0)
						return(x.id.compareTo(y.id));
					else
						return x.name.compareTo(y.name);
				}
				else
					return x.cgpa.compareTo(y.cgpa);
			}


		);	

		Scanner sc = new Scanner (System.in);
		System.out.print("Total Students: ");
		int n = sc.nextInt();
		String s;
		int id;
		double cgpa;
		for(int i = 0 ; i < n ; i++){
			System.out.print("Name : ");
			s = sc.next();
			System.out.print("ID : ");
			id = sc.nextInt();
			System.out.print("CGPA : ");
			cgpa = sc.nextDouble();
			if(ts.add(new Student(s, id, cgpa)) == true)
				System.out.print("\nData Added\n");
			else{
				System.out.print("\nAlreadyExisting Data\nEnter Again...\n");
				i--;
			} 
		}
		Iterator<Student> it = ts.iterator(); 
		System.out.println("Sorted Data : ");
		while(it.hasNext()){
			Student k = it.next();
			System.out.println(k.name + "\t" + k.id + "\t" + k.cgpa);
		}
	}
}