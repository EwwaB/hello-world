
public class Piwa4 {

	public static void main(String[] args) {

		String s = "s";

		int[] array2 = new int[100];

		for (int y = 100; y > 0; y--) {

			array2[y - 1] = y;

		}

		for (int y = 0; y < 100; y++) {
			// System.out.println(array2[y]);
		}

		for (int x = 100; x > 0; x-=4) {
			
			
			
			System.out.println (array2[x-1] + " bottles of beer on the wall, " + array2[x-1] +  " bottles of beer.");
			System.out.println ("Take one down and pass it around - " + array2[x-2]+ "bottles of beer on the wall.");
			System.out.println ("Take one down and pass it around - " + array2[x-3]+ "bottles of beer on the wall.");
			System.out.println ("Take one down and pass it around - " + array2[x-4]+ "bottles of beer on the wall.");
			
			if (x==4) {System.out.println ("Take it down and pass it around - no more bottles of beer on the wall"); }
			
			else {
			System.out.println ("Take one down and pass it around - " + array2[x-5]+ "bottles of beer on the wall.");
			}

		}
	}

}
