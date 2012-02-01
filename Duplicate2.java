public class Duplicate2 {
	private static int parseInt(String S) {
		int r=0;
		for (char ch:S.toCharArray() ){
			r=r*10+ch-'0';
		}
		return r;
	}
	public static void main (String[] args) {
		System.out.println(parseInt(args[0])*2);
		System.out.println(parseInt(args[1])*3);
	}
}