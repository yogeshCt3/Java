/*student{ name , cgpa, no_of_re}
demo{ int ElegibilityCrit(Eligibility ob))// return no of all eligible students}
store atleast 5 stu obj in array list
Eligibility is a func interface { boolean check student s)}*/

import java.util.*;
class Student{
	String name;
	int no_of_re;
	double cgpa;
	Student(String n, int nr, double cg){
		name = n;
		no_of_re = nr;
		cgpa = cg;
	}
}

interface Eligibility{
	boolean check(Student s);
}

class Demo{
	static ArrayList<Student> obj_s;
	int eligibleStudents(Eligibility ob){
		int count = 0;
		for(Student s : obj_s){
			if(s.no_of_re == 0 && s.cgpa > 7.5)
				count++;
		}
		return count;
	}
	public static void main(String ... yyyy){
		obj_s = new ArrayList<Student> ();
		for(int i = 0 ; i < 5; i++){
			obj_s.add(new Student("user", 0, 9.8));
		}
		Demo d_ob = new Demo();
		int k = d_ob.eligibleStudents(new Eligibility(){public boolean check(Student s){return true;}});
		System.out.println(k);
	}
}