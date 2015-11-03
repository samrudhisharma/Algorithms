import java.util.*;
//http://www.geeksforgeeks.org/check-if-two-given-strings-are-isomorphic-to-each-other/
//http://stackoverflow.com/questions/5920135/printing-hashmap-in-java
public class IsomorphicStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<Character, Character> map = new HashMap<Character, Character>();
		String input = sc.nextLine();
		String check = sc.nextLine();
	
		char c1[] = input.toCharArray();
		char c2[] = check.toCharArray();
		int len = c1.length;
		int len2 = c2.length;
		if(len != len2) 
		{}
		else
		{
			for(int i=0;i<len;i++)
			{
				if(!map.containsKey(c1[i]) && map.containsValue(c2[i]) == false)
				{
					map.put(c1[i], c2[i]);
				}
			}
			
			
			//
			/*for (Character name: map.keySet()){

	            String key =name.toString();
	            String value = map.get(name).toString();  
	            System.out.println(key + " " + value);  


			}*/
			//
			
			boolean answer = true;
			for(int i=0;i<len;i++)
			{
				
				if(map.get(c1[i]) != null){
					
					if(map.get(c1[i]).compareTo(c2[i]) != 0)
						answer = false;
				}
				else
				{
					answer = false; //This case is for when there are two symbols poitng to same char
					//abc -> xyx , ans = false
				}
				
			}
			
			if(answer) System.out.println("True");
			else System.out.println("False");
		}
	}

}
