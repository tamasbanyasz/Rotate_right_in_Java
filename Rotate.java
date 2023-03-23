
import java.util.List;

public class Rotate {
	
	static int arrayLength = 10;
	static int k = 1;

	
	public static void main(String[] args) {
		
		NewArray myNewArray = new NewArray(k, arrayLength);
		
		List<Integer> rotatedArray = myNewArray.rotatedToRight();
	}
}
