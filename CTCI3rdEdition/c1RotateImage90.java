import java.util.*;
public class c1RotateImage90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int origMatrix[][] = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				origMatrix[i][j] = sc.nextInt();
			}
		}
		
		rotateMatrix(origMatrix, n);
		
	}
	
	static void rotateMatrix(int mat[][], int n)
	{
		for(int layer =0 ;layer<n/2;++layer)
		{
			int first = layer;
			int last = n - 1 - layer;
			
			for(int i=first;i<last;++i)
			{
				int offset = i-first;
				
				int top = mat[first][i];
				
				mat[first][i] = mat[last-offset][first];
				mat[last-offset][first] = mat[last][last-offset];
				
				mat[last][last-offset] = mat[i][last];
				
				mat[i][last] = top;
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
