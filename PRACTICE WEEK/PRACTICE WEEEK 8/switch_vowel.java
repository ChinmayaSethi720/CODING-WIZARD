package practice_week_8;
import java.util.Scanner;
public class switch_vowel { 
	
	public static void main(String ags[]) {
		Scanner sc= new Scanner (System.in);
		String input=sc.next();
		String str="";
		
		String extract=vowel(input, str);
		
		if(input.equals(extract)) {
			System.out.println("The string consists of no vowels.");
		}
		else{
			System.out.println(extract);
		}
			
    } 
	public static String vowel(String input, String str) {
		char ch, chCase;
		for(int i=0;i<input.length(); i++) {
			ch=input.charAt(i);
			chCase=Character.toLowerCase(ch);
			switch(chCase) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'o':
				break;
			case 'u':
				break;
			default:
				str=str+ch;
			}
		}
		return str;
	}
} 