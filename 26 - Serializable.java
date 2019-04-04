import java.io.*;
class Elections implements Serializable{
	String name;
	int votes;
	Elections(String name, int v){
		this.name = name;
		votes = v;
	}
	void upVote(){
		votes++;
	}
	void downVote(){
		votes--;
	}
	void show(){
		System.out.println(name);
	}
}


class Main{
	public static void main(String ... yo) throws IOException, ClassNotFoundException{
		Elections e1 = new Elections("UP", 259);
		FileOutputStream out = new FileOutputStream("this.txt");
		ObjectOutputStream ok = new ObjectOutputStream(out);
		ok.writeObject(e1);


		
	}
}