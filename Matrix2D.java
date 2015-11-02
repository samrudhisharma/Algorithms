import java.util.*;
public class Matrix2D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int mat[][] = new int[6][6];
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				mat[i][j] = sc.nextInt();
				
			}
		}
		int sum = 0;
		int max = -1000;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				sum = mat[i][j]+ mat[i-1][j]+ mat[i-1][j-1]+ mat[i-1][j+1]+mat[i+1][j-1]+mat[i+1][j]+mat[i+1][j+1];
				if(max<sum)
					max = sum;
			}
		}
		
		System.out.println(max);
	}
	
}
