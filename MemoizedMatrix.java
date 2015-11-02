import java.util.Scanner;


public class MemoizedMatrix {

	private static long startTime = System.currentTimeMillis();
	static int M[][];
	static int q;
	static int an;
	static int counter = 0;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Matrices: ");
		an = sc.nextInt();
		int d1[][] = new int[an][2];
		for(int j = 0;j<an;j++)
		{
			System.out.println("Enter dimension 1: ");
			d1[j][0] = sc.nextInt();
			System.out.println("Enter dimension 2: ");
			d1[j][1] = sc.nextInt();
		}
		int df[] = new int[an+1];
		df[an] = d1[an-1][1];
		for(int j = 0;j<an;j++)
		{
			df[j] = d1[j][0];
		}

		//memoized_matrix_chain(df);
		int result =  memoized_matrix_chain(df);
		 System.out.println("Minimum number of multiplications: "+result);
		System.out.println("Number of recursive calls: "+counter);
		long endTime = System.currentTimeMillis();
        //System.out.println("It took " + (endTime - startTime) + " milliseconds");
    
	}
	
	public static int memoized_matrix_chain(int p[])
	{
		int n = p.length;
		M = new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				M[i][j] = 100000;
			}
		}
	return lookup_chain(M,p,1,n-1);
	}
	
	public static int lookup_chain(int M[][], int p[], int i, int j)
	{
		if(M[i][j]<100000)
			{return M[i][j];}
		
		if(i==j)
		{
			M[i][j] =0;
		}
		else
		{
		for(int k=i;k<j;k++)
		{
			q = lookup_chain(M,p,i,k) + lookup_chain(M,p,k+1,j)+p[i-1]*p[k]*p[j];
			counter = counter + 2;
			//System.out.println(q);
			if(q<M[i][j])
				M[i][j] = q;
		}
		}
		return M[i][j];
		
	}

}
//5 1 1 15 15 8 8 4 
//5 1 15 8 4