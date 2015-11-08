import java.util.*;
public class c1ReverseAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		reverse(s);

	}
	
	static void reverse(String input)
	{

	char c[] = input.toCharArray();
	int len = c.length;
	int start = 0;
	int end = len -1;

	while(start<end)
	{
	char temp = c[end];
	c[end] = c[start];
	c[start] = temp;
	start++;
	end--;
	}

	for(int i=0;i<len;i++)
	{
	System.out.print(c[i]+"");
	}
	}

}
