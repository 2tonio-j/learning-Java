//This is my first Java program; see HeadFirst, Chp1	

public class MyFirstApp {

	public static void main (String[] args) {
    		System.out.println("I Rule");
		System.out.println("The World");


		// print a new line using 'println'
		System.out.println();


		// declarations & assignments 	
		int x = 3;
		String name = "Dirk";
		x = x * 17;
		// call methods
		System.out.println("x is " + x);
		double d = Math.random();
		System.out.println("d is " + d);


		// print a new line using platform-independent way (%n)
		System.out.printf("%nA new line was printed before this one;%nand a new line comes after this%n");


		// For and While Loops
		while (x > 49) { 
			x = x - 1;
			System.out.println("right now x is " + x);
		}
			
		for (int j = 0; j < 4; j = ++j) {
			System.out.print("and now x is " + x);
		}


		// IF-ELSE conditions
		if (x == 0) {
			System.out.println("x must be 10");
		} else {
			System.out.println("x isn't 10");
		}
		if ((x < 3) & (name.equals("Dirk"))) {
			System.out.print("Gently");
		}

		System.out.printf("this line runs no matter what%n");
		
	}
}
