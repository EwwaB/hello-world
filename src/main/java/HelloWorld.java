public class HelloWorld {


	public static void main(String[] args) {

		String s = "s";

		for (int x = 99; x >= 0; x--) {
			if (x >= 2) {
			System.out.print(x + " bottle" + s + " of beer on the wall, " +  x  + " bottle" + s + " ");
			System.out.println(" \n Take one down and pass it around - " + (x - 1) + " bottle" + s + " of beer on the wall");
			}

			if (x == 1)
				
			{
				System.out.print(x + " bottle" + " of beer on the wall, " + x + " bottle" + " of beer");
				System.out.println("\n Take it down and pass it around - no more bottles of beer on the wall.");
				
			}
			
			}
		}
	
		
}