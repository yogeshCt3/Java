// delete a file having specific extention in the end
import java.io.*;
import java.util.*;
class M{
	static int count = 0;
	public static void clearFile(File obj, String extention){
		for(File f : obj.listFiles()){
			if(f.isDirectory()){
				clearFile(f, extention);
			}
			else if (f.isFile()){
				if(f.getName().endsWith(extention)){
					f.delete();
					count++;
				}
				
			}
		}
	}
	public static void main(String ... yogesh){
		String f_name, extention;
		File f;
		Scanner sc = new Scanner(System.in);	
		while(true){
			System.out.print("Enter the name of file/directory you want to delete : ");
			f_name = sc.next();
			f = new File(f_name);
			if(f.exists())
				break;
			System.out.println("Given path does not exists !\n Enter the path again...\n");
		}
		System.out.print("Enter the extention which you want to delete : ");						
		extention = sc.next();
		clearFile(f, extention);
		if(count == 0){
			System.out.println("There were no files with the given extention !");
		}
		else{
			System.out.println("Deleted " + count + " File(s) were delted from the given folder destination.");
		}
		
	}
}