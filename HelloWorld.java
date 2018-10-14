import java.util.*;
import java.io.*;

public class HelloWorld{
	public static void TDTU(){
		System.out.println("Hello World This is TDTU");
	}
	public static void Master() throws IOException{
		//Scanner sc = new Scanner(System.in);
		//System.out.print("Input your name: ");
		FileInputStream name = new FileInputStream("name.txt");
		Scanner sc = new Scanner(name,"UTF-8");
		while (sc.hasNextLine())
			System.out.println("Hello World I am " + sc.nextLine());
		sc.close();
	}
	
	public static void main(String[] args) throws IOException {
		TDTU();
		Master();
  }
}