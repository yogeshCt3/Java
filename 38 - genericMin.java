/*					
	Author » Yogesh K. Chhetri «	
*/
class Demo{
	public static <E extends Comparable <E>> E min(E[] list){
		E minPos = list[0];
		for(int i = 0; i < list.length ; i++){
			if(minPos.compareTo(list[i]) > 0)
				minPos = list[i];
		}
		return minPos;
	}
	public static void main(String ... lko){
		String [] s = {"This", "Is", "Sparta"};
		Integer [] i = {1, 5,6,7,8,4,3,5};
		Double []d = {7.4, 2.6, 0.9, 9.0, 9.8};
		Integer iMin = Demo.<Integer>min(i);
		String sMin = Demo.<String>min(s);
		Double dMin = Demo.<Double>min(d);
		System.out.println(iMin + "\n" + sMin + "\n" + dMin);
	}
}