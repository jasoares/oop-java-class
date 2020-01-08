import java.lang.reflect.Array;

public class HelloWorld {

	public static void main(String[] args) {
		String user = Array.getLength(args) > 0 ? args[0] : "user";
		System.out.println("Hello " + user + " and the world!");
	}
}
