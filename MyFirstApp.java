public class MyFirstApp {
	
	public static void main (String[] args) {
		System.out.print ("I rule the world!!");
		System.out.print ("Always and forever.");

		int x = 3;
		String name = "Dirk";
		x = x * 17;
		System.out.print ("x is " + x);
		double d = Math.random();
		// this is a comment
		
		// for and while loops
		while (x > 12) {
			x = x -1;
		}

		for (int j = 0; j < 10; j = j + 1) {
			System.out.print ("j is now " + j);
		}

		// Branching: if/else tests
		if (x == 10) {
			System.out.print("x must be 10");
		} else {
			System.out.print("x isn't 10");
		}
		if ((x < 3) & (name.equals("Dirk"))) {
			System.out.println ("Gently");
		}
		System.out.print ("this line runs no matte what");
	}
}

