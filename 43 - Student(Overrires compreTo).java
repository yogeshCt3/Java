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
		TreeSet<Student> ts = new TreeSet<>();	
		ts.add(new Student("Yogesh", 1, 9.8));
		ts.add(new Student("Vijay", 4, 8.0));
		ts.add(new Student("Rakesh", 11, 9.1));
		ts.add(new Student("Madhav", 12, 9.3));
		ts.add(new Student("Ajay", 14, 9.5));
		
		Iterator<Student> it = ts.iterator(); 
		while(it.hasNext()){
			Student k = it.next();
			System.out.println(k.name + "\t" + k.id + "\t" + k.cgpa);
		}
	}
}