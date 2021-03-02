import java.util.Scanner;
public class array_triplet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the sum of the triplet: ");
		int num = sc.nextInt();
		System.out.println("Enter the numbers of the array: ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		for (int x = 0; x < size; x++) {
			for (int y = 0; y < size; y++) {
				for (int z = 0; z < size; z++) {
					if (x != y & y != z & x != z) {
						int sum = array[x] + array[y] + array[z];
						if (sum == num) {
							System.out.println(array[x] + "," + array[y] + "," + array[z]);
							System.exit(0);
						}
					} else {
						continue;
					}
				}
			}
		}

	}

}
