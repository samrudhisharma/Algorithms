import java.util.*;
//Solution taken from CTCI
public class c1ElementMatrix0byRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		turnMatrixZero(mat,n);
	}
	
	static void turnMatrixZero(int mat[][], int n)
	{
		boolean row[] = new boolean[n];
		boolean column[] = new boolean[n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(mat[i][j]==0)
				{
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(row[i]) nullifyRow(mat,i,n);
		}
		
		for(int j=0;j<n;j++)
		{
			if(column[j]) nullifyColumn(mat, j,n);
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
	
	
	static void nullifyRow(int mat[][], int row,int n)
	{
		for(int j=0;j<n;j++)
		{
			mat[row][j] = 0;
		}
	}
	
	static void nullifyColumn(int mat[][], int column,int n)
	{
		for(int i=0;i<n;i++)
		{
			mat[i][column] = 0;
		}
	}

}
