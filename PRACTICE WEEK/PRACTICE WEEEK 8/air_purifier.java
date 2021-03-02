import java.util.Scanner;
public class Air_Purifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the temperature of room in deg C: ");
		int temp=sc.nextInt();
		System.out.println("Enter the times door opened: ");
		int door=sc.nextInt();
		System.out.println("Operating time of purifier in min: ");
		int min= sc.nextInt();
		int total= 30*door+40*(min-door)+diff(temp,min);
	
		System.out.println("Purifier purifies "+total+" sq/min with the given conditions.");
		

	}
	public static int diff(int temp, int min) {
		int add=0;
		if(temp>25)
		{
			add=min*2*(temp-25);
		}
		else if(temp<25) {
			add= min*2*(temp-25);
		}
		else if(temp==25) {
			add=temp;
		}
		return add;
	}
}
