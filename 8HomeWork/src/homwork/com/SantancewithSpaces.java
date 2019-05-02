package homwork.com;

public class SantancewithSpaces {

	public static void main(String[] args) {
		String mytext = "  I    am      learning     Java   Core  ";
		
		 System.out.println(mytext.replaceAll("^ +| +$|( )+", "$1"));
		 
		 System.out.println(mytext.trim().replaceAll("[ ]{2,}", " "));

		/*Pattern p = Pattern.compile("[a-z]+");*/
		
	}

}
