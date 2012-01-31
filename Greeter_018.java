public class Greeter {
	private string format
	public Greeter()
		this.format=
	}
	public.void.greet()
	System.out.println(format + name);
	}
}
public class HelloWorld {
	public static void main(S[] args) {
	Greeter g=new Greeter("Hello, ");
	for(S a: args) {
	g.greet(a);
	}
	Geeter g=args[0].equals("en")
	? new Greeter("Hello, ")
	: new Greeter("Salut, ");
	}
}