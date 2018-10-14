import java.util.*;

public class HelloWorld{
    
	public static void TDTU(){
		System.out.println("Hello World This is TDTU");
  	}

	public static void Master(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your name: ");
		String name;
		name = sc.nextLine();
		System.out.println("Hello World I am " + name);

	}
	
	public static void main(String[] args) {
		TDTU();
   		 Master();
    	}
}
