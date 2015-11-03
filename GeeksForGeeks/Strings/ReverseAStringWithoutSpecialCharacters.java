import java.util.*;
public class ReverseAStringWithoutSpecialCharacters {
// I Ab,c,de!$
// O ed,c,bA!$ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		char c[] = input.toCharArray();
		
		int low = 0, high = c.length-1;
		
		while(low<high)
		{
			if(isAlphabet(c[low]) == false) low++;
			else if(isAlphabet(c[high]) == false) high--;
			else 
			{
				char temp = c[high];
				c[high]= c[low];
				c[low] = temp;
				low++;
				high--;
			}
		}
		
		for(int i=0;i<c.length;i++) System.out.print(c[i]+"");
	}
	
	public static boolean isAlphabet(char x)
	{
		return (( x>= 'A' && x<= 'Z')||(x>='a' && x<= 'z'));
	}
}
