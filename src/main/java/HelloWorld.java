public class HelloWorld {
	
	public static void main(String[] args) {
	

	 int liczbabutelek = 99; 
	 String beer1 = "bottles of beer";

	 while (liczbabutelek >0); {
		 if ( liczbabutelek == 1 ) { beer1 = "bottle of beer";
		 System.out.println (liczbabutelek + beer1 + "on the wall," + liczbabutelek + beer1 + 
				 "Take one down and pass it around -" + liczbabutelek + beer1 + "on the wall.");
		 
	 }
		 
		 else {
			 
		            System.out.println( liczbabutelek + beer1 + "on the wall," + liczbabutelek + beer1 +
		            		"Take one down and pass it around -" + liczbabutelek + beer1 + "on the wall.");
		            }

		            liczbabutelek = liczbabutelek - 1;



		            if (liczbabutelek == 0){

		                System.out.println( "no more bottles of beer on the wall" );

		 }
}
	}
	
}