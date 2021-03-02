package practice_week_8;
import java.util.*;
public class maximum_length{
// Function to find the absolute difference 
// between X and Y with given operations 
public static int AbsDiff(int X, int Y, int A, 
                          int B, int N) 
{ 
     
    // Stores maximum absolute difference 
    // between X and Y with given operations 
    int maxDiff = 0; 
   
    // Stores maximum number of operations 
    // performed on X 
    int n1 = X - A; 
   
    // Update X 
    X = X - Math.min(N, n1); 
   
    // Decrementing N at most N times 
    N = N - Math.min(N, n1); 
   
    // Stores maximum number of operations 
    // performed on Y 
    int n2 = Y - B; 
   
    // Update Y 
    Y = Y - Math.min(N, n2); 
   
    // Update maxDiff 
    maxDiff = Math.abs(X - Y); 
   
    return maxDiff; 
} 
   
// Function to find the max absolute difference 
// between X and Y with given operations 
public static int maxAbsDiff(int X, int Y, int A, 
                             int B, int N) 
{ 
     
    // Stores absolute difference between 
    // X and Y by first decrementing X and then Y 
    int diffX_Y_1; 
   
    // Stores absolute difference between X 
    // and Y first decrementing Y and then X 
    int diffX_Y_2; 
   
    // Update diffX_Y_1 
    diffX_Y_1 = AbsDiff(X, Y, A, B, N); 
   
    // Swap X, Y and A, B 
    int temp1 = X;
    X = Y;
    Y = temp1;
     
    int temp2 = A;
    A = B;
    B = temp2;
   
    // Update diffX_Y_2 
    diffX_Y_2 = AbsDiff(X, Y, A, B, N); 
   
    return Math.max(diffX_Y_1, diffX_Y_2); 
}
public static void main(String[] args)
{
	Scanner sc= new Scanner (System.in);
    int X = sc.nextInt(); 
    int Y = sc.nextInt(); 
    int A = sc.nextInt(); 
    int B = sc.nextInt(); 
    int N = sc.nextInt(); 
     
    System.out.println(maxAbsDiff(X, Y, A, B, N));
}
}