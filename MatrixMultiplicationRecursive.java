import java.util.Scanner;


public class MatrixMultiplicationRecursive {
	
	private static long startTime = System.currentTimeMillis();
	static int M[][];
	static int q;
	static int counter = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Matrices: ");
		int an = sc.nextInt();
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

		M = new int[an+1][an+1];
		
		int result = recursivematrix(df,1,an);
	    System.out.println("Minimum number of multiplications: "+result);
	    System.out.println("Number of recursive calls: "+counter);
	    long endTime = System.currentTimeMillis();
       // System.out.println("It took " + (endTime - startTime) + " milliseconds");
    
	}
	
	public static int recursivematrix(int p[], int i, int j)
	{
		if(i==j)
			{return 0;}
		M[i][j] = 100000;
		//5 1 1 15 15 8 8 4 
		for(int k=i;k<j;k++)
		{
			q = recursivematrix(p,i,k) + recursivematrix(p,k+1,j)+p[i-1]*p[k]*p[j];
			counter = counter + 2;
			//System.out.println(q);
			if(q<M[i][j])
				M[i][j] = q;
		}
		return M[i][j];
		
	}

}
