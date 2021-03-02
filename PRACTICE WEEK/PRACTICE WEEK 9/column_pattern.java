import java.util.Scanner;

public class column_pattern {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n / 2;
		int x = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= temp; j++) {
				System.out.print(" ");
			}
			int num = x / 2 + 1;
			for (int k = 1; k <= x; k++) {
				System.out.print(num);
				if (k <= x / 2) {
					num--;
				} else {
					num++;
				}
			}
			System.out.println();
			if (i <= n / 2) {
				temp = temp - 1;
				x = x + 2;
			} else {
				temp = temp + 1;
				x = x - 2;
			}
		}
	}
}
