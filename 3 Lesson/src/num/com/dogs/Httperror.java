package num.com.dogs;

public class Httperror {

	public enum Httperrorss {
		FIRSTERROR, SECONDERROR, THIRDERROR, FOURTHERROR
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Httperrorss checkerror;
		checkerror = Httperrorss.FIRSTERROR;
		switch (checkerror) {
		case FIRSTERROR:
			System.out.println("400 Bad Request "); break;
		case SECONDERROR:
			System.out.println("400 Bad Request "); break;
		case THIRDERROR:
			System.out.println("400 Bad Request "); break;
		case FOURTHERROR:
			System.out.println("400 Bad Request "); break;
		default:
			System.out.println("Unknown error. Please contact your administrator.");
	
			
	}

}
}