import java.util.*;
public class ReverseASentenceGivenTheWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		int len = sentence.length();
		char c[] = sentence.toCharArray();
		int start =0;
		int end = 0;
			
		for(int i=0;i<len;i++)
		{
			if(c[i]==' ')
			{
				end = i;
				revWord(start,end,c);
				start = i+1;
			}
		}
		
		
		revWord(start,len,c); //reverse the last word
			
		revWord(0,len,c); //reverse the whole sentence now
		
		
		for(int i=0;i<len;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
	
	public static void revWord(int start, int end, char c[])
	{
	
		
		end-=1;
		while(start<end)
		{
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}
	}

}
