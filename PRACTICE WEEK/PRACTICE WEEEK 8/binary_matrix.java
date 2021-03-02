package practice_week_8;
import java.util.Scanner;
public class binary_matrix{

static void BinaryMatrix(int N)
{
	int matrix[][]= new int[N][N];
	for (int i =0; i < N; i++) 
	{
		matrix[i][i] = 1;
	}

	for (int i = 0; i < N; i++) 
	{
		matrix[i][N-i-1] = 1;
	}
	if (N % 2 != 0)
	{
		matrix[N / 2][0] = 1;
		matrix[0][N / 2] = 1;
	}

	for (int i=0; i<N; i++) 
	{
		for (int j=0; j<N; j++)
		{
		System.out.print(matrix[i][j] + " ");
		}
	System.out.println();
	}
}
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	int N = sc.nextInt();
	BinaryMatrix(N);
	
}
}
