import java.util.*;

public class roman {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number in the range 1 to 1000");
		int num = sc.nextInt();
		if (num < 1 && num > 1000) {
			System.out.println("Number not in range");
			System.exit(0);
		}
		System.out.print(convert(num));
	}

	public static String convert(int num) {
		String R = "";
		while (num > 0) {
			if (num >= 1000) {
				R += "M";
				num -= 1000;
				continue;
			}
			if (num >= 900) {
				R += "CM";
				num -= 900;
				continue;
			}
			if (num >= 500) {
				R += "D";
				num -= 500;
				continue;
			}
			if (num >= 400) {
				R += "CD";
				num -= 400;
				continue;
			}
			if (num >= 100) {
				R += "C";
				num -= 100;
				continue;
			}
			if (num >= 90) {
				R += "XC";
				num -= 90;
				continue;
			}
			if (num >= 50) {
				R += "L";
				num -= 50;
				continue;
			}
			if (num >= 40) {
				R += "XL";
				num -= 40;
				continue;
			}
			if (num >= 10) {
				R += "X";
				num -= 10;
				continue;
			}
			if (num >= 9) {
				R += "IX";
				num -= 9;
				continue;
			}
			if (num >= 5) {
				R += "V";
				num -= 5;
				continue;
			}
			if (num >= 4) {
				R += "IV";
				num -= 4;
				continue;
			}
			if (num >= 1) {
				R += "I";
				num -= 1;
				continue;
			}

		}
		return R;

	}
}