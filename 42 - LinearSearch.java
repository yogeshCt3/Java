/*					
	Author » Yogesh K. Chhetri «	
*/
class Gen{
	public static <E extends Comparable<E>> int linearSearch(E [] list, E key){
		int i = 0; 
		for(E val : list){
			if(val.compareTo(key) == 0)
				return i;
			i++;
		}
		return -1;
	}
	public static void main(String ... lko){
		Integer arr[] = new Integer[10];
		for(int i = 0; i < 10 ; i++)
			arr[i] = i;
		
		System.out.println(Gen.<Integer>linearSearch(arr, 12));
	}
}