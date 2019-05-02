package homwork.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UScurrency {

	public static void main(String[] args) throws IOException {
		int count = 0;
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})");

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your UScurrency text:");
		String pip = br.readLine();
		System.out.println(pip);
		Matcher m = p.matcher(pip);
		m.reset();

	     while (m.find()) {
	    	 count++;
	    	 /*System.out.println("It occurs " + count);*/
	         System.out.print(pip.substring(m.start(), m.end()) + ", ");
	     }

	     	System.out.println("It occurs " + count + " times");
	        
	}

}
