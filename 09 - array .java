import java.util.*;
class Demo{
	public static void main(String ... N){
		// generic <> 
		ArrayList<Integer> al = new ArrayList<>();
		for( Integer i = 0; i < 5; i++)
			al.add(i);
		/*for(Integer i : al)
			System.out.println(i);
		al.add(0, -10);
		for(Integer i : al)
			System.out.println(i);*/
		al.add(0, 2);
		//ArrayList<Integer> al2 = new ArrayList<>();
		al.remove(2);
		System.out.println(al);

		
		
	}
}