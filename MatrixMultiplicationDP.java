import java.util.*;
public class MatrixMultiplicationDP {

	private static long startTime = System.currentTimeMillis();
	
	public static void main(String[] args) {
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

		/*for(int j = 0;j<an+1;j++)
		{
			System.out.println(df[j]);
		}*/
		int M[][] = new int[an+1][an+1];
		int K[][] = new int[an+1][an+1];
		for(int i=0;i<an+1;i++)
		{
			for(int j=0;j<an+1;j++)
			{
					M[i][j] = 0;
					K[i][j] = 0;
			}
		}
		
		
		for(int i=(an);i>0;i--)
		{
			
			int calc = 0;
			for(int j=i+1;j<=an;j++)
			{
				int min = 100000;
				for(int k=i;k<j;k++)
				{
				
					calc = M[i][k]+M[k+1][j]+df[i-1]*df[k]*df[j];
					if(min>calc)
					{
					min = calc;
					M[i][j] = calc;
					K[i][j] = k;
					}
				}
			}
		}
		
		/*for(int i=1;i<an+1;i++)
		{
			for(int j=1;j<an+1;j++)
			{
					System.out.print(M[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<an+1;i++)
		{
			for(int j=1;j<an+1;j++)
			{
					System.out.print(K[i][j]+"\t");
			}
			System.out.println();
		}*/
		
	

		System.out.println("The minimum number of matrix multiplications: "+ M[1][an]);
		long endTime = System.currentTimeMillis();
        //System.out.println("It took " + (endTime - startTime) + " milliseconds");
    
	}

}
