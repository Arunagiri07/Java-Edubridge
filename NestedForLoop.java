/*  package liveclass;

/* 
 * public class NestedForLoop{
 * 
 * public static void main(String[] a)// static methods are {//first for loop
 * --row //inner for loop --column // 1 2 3 4 5 for (int j = 1; j <= 4; j++)
 * {//j=5 5<=4 t for (int i = 1; i <= 5; i++) {//i=6 6<=5 f System.out.print(i +
 * " ");//1 2 3 4 5 //1 2 3 4 5 //1 2 3 4 5 } //1 2 3 4 5
 * System.out.println();//new line } } }
 */

/*
 * public class NestedForLoop{ public static void main(String[] a)// static
 * methods are {//first for loop --row //inner for loop --column // 1 2 3 4 5
 * for (int j = 2; j <= 10; j++) { for (int i = 1; i <= 10; i++) {
 * System.out.print((j*i)+" ");//2*1,2*2,2*3....2*10 }
 * System.out.println();//new line } }}
 */

/*package liveclass;

public class NestedForLoop {
	public static void main(String[] a) {
  for (int j = 1; j<=5; j++) {//j=2
		for (int i = 1; i<=j; i++) {//i=3 3<=2
			System.out.print("1");
		}                            
		System.out.println();//new line
	}
	}}*/

/*
 * package liveclass;
 * 
 * public class NestedForLoop { public static void main(String[] a) { for (int j
 * = 1; j<=5; j++) {//j=1, j<=5 for (int i = 5; i>=j; i--) { //i=5 ,5>=1
 * System.out.print("1"); } System.out.println();//new line } }
 * 
 * } }
 */

package liveclass;

public class NestedForLoop {

	public static void main(String[] a) {
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		int count=1;
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}
}