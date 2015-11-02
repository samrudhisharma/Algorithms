import java.util.*;

public class HashSetCorrect {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<String> hs = new HashSet<String>(); 
		
		sc.nextLine();
		
		for(int  i =0; i<n;i++)
		{
			String s = sc.nextLine();
			hs.add(s);
			System.out.println(hs.size());
			}
		
	}

}
