package lesson.com;
public class lesson8 {

	public static void main(String[] args) {
		
		/*final double PI = 3.1415926;
		String format = "%.2f";
		String s = String.format(format, PI);
		System.out.println(s);
		System.out.printf(format, PI);*/
		int i;
		char ss[] = {'J', 'a', 'v', 'a'};
		String str = new String(ss);
		i = str.length();
		char ch = str.charAt(2);
		String num = String.valueOf(8);
		num = str.concat("-" + num);
		num = num.replace("8", "SE");
		str = num + "-8";
		System.out.println(num);
		System.out.println(str);
		String[] arr = str.split("-");
		for (String w : arr) {
			System.out.println(w);
		}
	}

}
