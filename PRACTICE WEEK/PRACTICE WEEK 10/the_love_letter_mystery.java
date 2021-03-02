package practice_test_10;
import java.util.*;
public class the_love_letter_mystery {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int q=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<q; i++) {
			String str=sc.nextLine();
			int count=0;
			
	
			int y=str.length()-1;
			for(int x=0; x<y; x++,y--) {
				count += Math.abs(str.charAt(x) - str.charAt(y));
			}
			System.out.println(count);
		}

	}

}
