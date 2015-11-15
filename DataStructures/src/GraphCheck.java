import java.util.*;
public class GraphCheck {

	public static void main(String[] args) {
	
		Graph checkg = new Graph();
		checkg.addEdge(0, 1);
		checkg.addEdge(2, 1);
		checkg.addEdge(3, 2);
		checkg.addEdge(3, 4);
		checkg.addEdge(0, 3);
		
		checkg.display();

	}

}
