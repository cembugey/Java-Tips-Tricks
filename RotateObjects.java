import java.util.ArrayList;
import java.util.Collections;

public class RotateObjects {

	public static void main(String[] args) {
		
		// Use Collections.rotate() to rotate a collection or array of objects
		
		ArrayList<Integer> list = new ArrayList<Integer>() {{
			add(1);
			add(2);
			add(3);
			add(4);
		}};
		System.out.println(list);   // Output: [1, 2, 3, 4]
		Collections.rotate(list, 1);
		System.out.println(list);	// Output: [4, 1, 2, 3]
		

	}

}
