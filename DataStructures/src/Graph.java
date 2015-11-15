import java.util.*;
import java.util.Map.Entry;

//Directed Graph: 

public class Graph {

	HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<Integer, ArrayList<Integer>>();
	//Creating an adj list -  for each vertex
	
	public void addEdge(int u, int v)
	{
		if(!adjList.containsKey(u))
		{
			adjList.put(u, new ArrayList<Integer>()); 
			//Create a new entry for a vertex that has not been encountered yet
		}
		
		/*if(!adjList.containsKey(v))
		{
			adjList.put(v, new ArrayList<Integer>()); 
			//Create a new entry for a vertex that has not been encountered yet
		}*/
		
		adjList.get(u).add(v);
		//adjList.get(v).add(u);
		
		//Now add v, to the adj list of a newly created node or existing node
	}
	
	public void display()
	{
		for (Entry<Integer, ArrayList<Integer>> ee : adjList.entrySet()) {
		    int key = ee.getKey();
		    ArrayList<Integer> values = ee.getValue();
		    System.out.println(key+" "+values);
		}
	}
}
