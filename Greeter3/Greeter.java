public class Greeter {
	private String format;
	public static int count=0; //переменная считает количество вызовов
	public Greeter(String format) {
		this.format=format;
	}
	public void greet(String name) {
		System.out.println(format + name);
		count++;
	}
}