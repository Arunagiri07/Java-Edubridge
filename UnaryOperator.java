package operators;

public class UnaryOperator {
	public static void main(String[] args) {
		// unary operator +,-,++(increment) ,--(decrement)
		int x = 1000, y = 0;
		y = ++x;// preincrement
		// x=x+1 1000+1
		// y=x
		System.out.println(x + " " + y);
		int num1 = 100, num2 = 0;
		num2 = num1++;// postincrement
		// num2=num1
		// num1=num1+1
		System.out.println(num1 + " " + num2);// 101 101
		int z = 2345;
		System.out.println(z++);//postincrement
		System.out.println(++z);//preincrement
        System.out.println(z);
        
        int n =100;
        System.out.println(n++ + ++n + ++n);
		System.out.println(n);
	}

}
