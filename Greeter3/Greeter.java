public class Greeter {
	private String format;
	public static int count=0; //���������� ������� ���������� �������
	public Greeter(String format) {
		this.format=format;
	}
	public void greet(String name) {
		System.out.println(format + name);
		count++;
	}
}