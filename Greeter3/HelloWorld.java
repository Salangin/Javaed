public class HelloWorld {
	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
		Greeter g=new Greeter("Hello, ");
		// Greeter g=args[0].equals("en")
		// ? new Greeter("Hello, ")
		// : new Greeter("Salut, ");
	// }
		for (String a:args) { // ����� �� ������� �������� ���� , ���� ������������ ��������� ��������
			g.greet(a);
		}
		System.out.println(g.count);
		System.out.println(Greeter.count);
		}
	}	
}