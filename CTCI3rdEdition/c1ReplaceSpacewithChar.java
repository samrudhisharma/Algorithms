import java.util.*;
public class c1ReplaceSpacewithChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int truelen = sc.nextInt();
		
		char c[] = input.toCharArray();
		char c1[] = StringMani(c,truelen);
		for(int i=0;i<c1.length;i++)
			System.out.print(c1[i]+" ");
		
	}
	
	static char[] StringMani(char c1[],int truelen)
	{
		int spaceCount = 0, newLength, i;
		for(i=0;i<truelen;i++)
		{
			if(c1[i] == ' ')
				spaceCount++;
		}
		
		newLength = truelen+ spaceCount * 2;
		char c2[] = new char[newLength];
		
		for(i = truelen-1; i>=0;i--)
		{
			if(c1[i]==' ')
			{
				c2[newLength-1] = '0';
				c2[newLength-2] = '2';
				c2[newLength-3] = '%';
				newLength-=3;
			}
			else
			{
				c2[newLength-1] = c1[i];
				newLength--;
			}
		}
		return c2;
	}
	
}
