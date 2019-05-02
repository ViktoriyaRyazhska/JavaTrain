package homwork.com;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Username {
	
	public static void chekNames(String usernam) {
		Pattern p = Pattern.compile("^[a-z0-9 -]{3,15}$");
		Matcher m = p.matcher(usernam);
		if (m.matches()) {
			  System.out.println(usernam);
		}

	}
	
	/*public static boolean checkWithRegExp(String userNameString) {
		Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
		Matcher m = p.matcher(userNameString);
		return m.matches();
		
	}*/
	
	public static void main(String[] args) {
	
		String[] name = {"ooo4", "Sdfgh", "444444", "Dfghjkloiuytrew3", "456"};
		
		

		
		for (int i = 0; i < name.length; i++) {
		
			chekNames(name[i]);
			
		}	
		
		
	}

}
