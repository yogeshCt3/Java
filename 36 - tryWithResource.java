/*					
	Author » Yogesh K. Chhetri «	
*/			
import java.io.*;
class User{
	public static void main(String ... lko) throws Exception{
		try(FileInputStream fin = new FileInputStream("this.txt"); FileOutputStream fout = new FileOutputStream("that.txt", true)){
				int data;
				while((data = fin.read()) != -1){
					fout.write(data);	
				}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}		
