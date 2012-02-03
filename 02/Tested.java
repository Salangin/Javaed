public class Tested {
	public static void main(String[] args) {
		if (args.length > 0)
			System.out.println(decorate(args[0]));
		return;
	}
	public static String decorate(String s) {
		return "+++" + s + "+++"; //print first arg with "+++"
		}
}