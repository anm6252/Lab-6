
public class EX_2 {

	public static void main(String[] args) {
	
		int foo(int N); {
			 int result = 0;
			 for (int i=0; i<N; i++)
			 result++;
			 for (int j=0; j<1000000; j++)
			 result+=j;
			 
			 return result;
		}

	}
}

//time complexity is O(N^2)