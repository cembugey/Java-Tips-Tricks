import java.util.ArrayList;

public class InitializeCollections {

	public static void main(String[] args) {
		
		// Use double braces to initialize easily:
		ArrayList<Integer> list = new ArrayList<Integer>() {{ 
            add(1); 
            add(2); 
            add(3); 
            add(4); 
        }}; 
        System.out.println(list);  // Output: [1, 2, 3, 4]

	}

}
