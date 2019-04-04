interface Int1{
	void finalCall();
	
}
interface Int2{
	void finalCall();
}

class UseCase implements Int2, Int1{
	public void finalCall(){
		System.out.println("This is a sample run");
	}	

}