import java.util.*;
public class TwoDArrayInSpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		PrintSpiralMat(a,m,n);

	}

	public static void PrintSpiralMat(int a[][], int m, int n)
	{
		int t=0, b = m-1, l =0, r = n-1;
		int dir = 0;
		
		while(t<=b && l<=r)
		{
			if(dir==0) //Left to right direction
			{
				for(int j=l;j<=r;j++)
				{
					System.out.print(a[t][j]+" ");
				}
				t++;
				dir = 1;
			}
			else if(dir == 1) //top to bottom 
			{
				for(int i=t;i<=b;i++)
				{
					System.out.print(a[i][r]+" ");
				}
				r--;
				dir = 2;
			}
			else if(dir == 2) //left to right
			{
				for(int j=r;j>=l;j--)
				{
					System.out.print(a[b][j]+" ");
				}
				b--;
				dir = 3;
			}
			
			else if(dir==3) //bottom to top
			{
				for(int i=b;i>=t;i--)
				{
					System.out.print(a[i][l]+" ");
				}
				l++;
				dir = 0;
			}
	
		}
		
	}
}
