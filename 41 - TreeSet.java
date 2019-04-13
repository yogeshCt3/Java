/*					
	Author » Yogesh K. Chhetri «	
*/
import java.util.*;
class Demo{
	public static void main(String...lko){
		TreeSet <Integer> ts = new TreeSet<>();
		for(int i = 0 ; i < 10 ; i++){
			if(ts.add(i) == true )
				System.out.println(i + " Added");
		}	

		for(int i = 6 ; i < 14 ; i++){
			if(ts.add(i) == true)
				System.out.println(i + " Added");
			else
				System.out.println(i+ " not added");
		}	
		System.out.println("Size : " + ts.size() + "\nTraversal Using Iterator :");
		Iterator <Integer> it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}