package operators;

public class TernaryOperator {
	public static void main(String[] args) {
		int x=100,y=244;
		String result =x<y?"x is smaller" :"y is smaller"; 
		int result1 =(x<y ? x : y); 
		System.out.println(result);
		System.out.println(result1);

	}
}
