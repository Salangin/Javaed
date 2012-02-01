public class Greeter {
	private String format;
	public Greeter(String format) {
		this.format=format;
	}
	public void greet(String name) {
		System.out.println(format + name);
	}
}
public class HelloWorld {
	public static void main(String[] args) {
		Greeter g=new Greeter("Hello, ");
		for(String a: args) {
			g.greet(a);
		}
	}
	// Greeter g=args[0].equals("en")
	//? new Greeter("Hello, ")
	//: new Greeter("Salut, ");
	//}
}