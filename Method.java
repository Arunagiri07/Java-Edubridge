package liveclass;

import java.util.Scanner;

public class Method {

		/*protected static void add(int num1,int num2) {
			//int num1=100,num2=300;
			int res=num1+num2;
			System.out.println(res);
		}
		
		public static void main(String[] args) {
			
			System.out.println("start of main");
			add(123,789);
			add(12,89);
			add(3456,897);
			
			 * int num1=100,num2=300; int res=num1+num2; System.out.println(res);
			 
			
			
			 * int x1=500,y1=600; int res1=x1+y1; float avg=res/2;
			 
			
			
		}


	}*/
	
	
	
	

		/*
		 * private static int add(int num1,int num2) { //int num1=100,num2=300; int
		 * res=num1+num2; return res; }
		 * 
		 * public static void main(String[] args) {
		 * 
		 * System.out.println("start of main"); int r=add(123,789);
		 * System.out.println("first"+r); r=add(12,89); System.out.println("second"+r);
		 * r=add(3456,897); System.out.println("third"+r); int num1=100,num2=300; int
		 * res=num1+num2; System.out.println("main"+res);
		 * 
		 * }
		 * 
		 * }
		 */


	
	
	public static void displayMessage(String message,Scanner scanner)
	{
		//Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of times to repeat");
		int ntimes=scanner.nextInt();
		for(int i=1;i<=ntimes;i++) {
			System.out.println(message);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the message");
		String message=scanner.nextLine();
		displayMessage(message,scanner);
	}

}
