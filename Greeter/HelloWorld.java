public class HelloWorld {
	public static void main(String[] args) {
		Greeter g=new Greeter("Hello, ");
		// Greeter g=args[0].equals("en")
		// ? new Greeter("Hello, ")
		// : new Greeter("Salut, ");
	// }
	// ����� �� ������� �������� ���� , ���� ������������ ��������� ��������
		for (String a:args) {
			g.greet(a);
		}
	}	
}