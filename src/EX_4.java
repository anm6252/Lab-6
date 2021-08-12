import java.util.Arrays;
public class EX_4 {

	public static void main(String[] args) {
	//	numbers = {1, 14, 15, 24, 55, 59, 73, 90, 94, 99} 
	//	target = 73
		
		
		//	pass 1 {1, 14, 15, 24, 55, 59, 73, 90, 94, 99} 
				//Middle: 55
				//Left Bound: 1
				//Right Bound: 99
		
		//Excluding the left side
		//	pass 2 {59, 73, 90, 94, 99} 
				//Middle: 90
				//Left Bound: 59
				//Right Bound: 99
		
		//Excluding the right side
		//	pass 3 {59, 73} 
				//Middle: 59
				//Left Bound: 59
				//Right Bound: 73
		
		//Return 7
		
	}

}
