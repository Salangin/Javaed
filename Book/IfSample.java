//if
class IfSample {
	public static void main (String args[]) {
		int x, y;
		x = 10;
		y = 20;
		if(x < y) System.out.println("x less than y");
		
		x = x * 2;
		if(x == y) System.out.println("x is equal to y");
		
		x = x * 2;
		if(x > y) System.out.println("x is more than y");
		
		if(x == y) System.out.println("no output"); //no output
	}
}