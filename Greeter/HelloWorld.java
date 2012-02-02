public class HelloWorld {
	public static void main(String[] args) {
		Greeter g=new Greeter("Hello, ");
		// Greeter g=args[0].equals("en")
		// ? new Greeter("Hello, ")
		// : new Greeter("Salut, ");
	// }
	// нужно по другому написать цикл , если используется тернарный оператор
		for (String a:args) {
			g.greet(a);
		}
	}	
}