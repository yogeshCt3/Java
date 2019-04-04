// sample explanation for Singelton Pattern
class President{
	private static President status = null;
	private String name;	
	private President(String name){
		this.name = name;
	}
	static President getObject(String name){
		if(status == null)
			status = new President(name);
		return status;
	}
}
class Driver{
	public static void main(String ... y){
		President india = President.getObject("RamNath Kovind");
		President russia = President.getObject("Valdiamir Putin");
		System.out.print(india == russia);
	}
}