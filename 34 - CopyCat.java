/*					
	Author » Yogesh K. Chhetri «	
*/					
import java.io.*;
class CopyCat{
	void copyToFile(String source, String destination) throws IOException{
		try{
			FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream(destination, true);	// true is used to enable the flag to append the data rather than flushing the entire content
			int data, count = 0;
			data = fin.read(); // read first character
			while(data != -1){
				count++;
				fout.write(data);
				data = fin.read(); 	// update to next character at the buffer
			}
			System.out.println("Copied " + count + " character(s) from " + source + " to " + destination);
		}
		catch(IOException e){
			e.printStackTrace();	// get the compiler generated message
		}
	}
}

class Demo{
	public static void main(String...s) throws IOException {
		CopyCat cc = new CopyCat();
		cc.copyToFile("this.txt", "that.txt");
	}
}