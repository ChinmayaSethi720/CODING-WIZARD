import java.util.*;
public class Mars_Exploration {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String help=sc.next();
		help=help.toUpperCase();

		int count=0;
		for(int i=0; i<help.length(); i+=3) {
			if(help.charAt(i)!='S') {
				count+=1;
			}
			if(help.charAt(i+1)!='O') {
				count+=1;
			}
			if(help.charAt(i+2)!='S') {
				count+=1;
			}
		}
		System.out.println(count);

	}

}
