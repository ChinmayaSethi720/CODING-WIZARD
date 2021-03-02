import java.util.Scanner;

public class string_remove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String str1 = sc.nextLine();
		System.out.println("Enter 2st string: ");
		String str2 = sc.nextLine();
		System.out.print(remove(str1, str2));

	}

	public static String remove(String str1, String str2) {

		String str_lower = str2.toLowerCase();
		String str_upper = str2.toUpperCase();

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				char x = str_lower.charAt(j);
				char y = str_upper.charAt(j);
				String strx = Character.toString(x);
				String stry = Character.toString(y);

				str1 = str1.replaceAll(strx, "");
				str1 = str1.replaceAll(stry, "");
			}
		}

		return str1;
	}

}