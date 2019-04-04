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
	public static void main(String ...yo) throws IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream("this.txt");
		ObjectInputStream ok = new ObjectInputStream(fin);
		Elections obj = (Elections) ok.readObject();
		obj.show();
	}
}