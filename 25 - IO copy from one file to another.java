import java.io.*;
class G{
	public static void main(String ... c) throws IOException{
		FileInputStream fin = new FileInputStream("this.txt");
		FileOutputStream fout = new FileOutputStream("that.txt");
		int x = fin.read();
		while(x != -1){
			fout.write(x);
			x = fin.read();
		}
	}
}
