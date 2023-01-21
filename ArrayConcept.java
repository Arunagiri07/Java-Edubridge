package liveclass;

import java.util.Scanner;

public class ArrayConcept {
	public static void main(String[] args) {
		float[] marks = {25.0f,39.0f,90.0f,75.0f,80.0f};
		System.out.println("Five student marks");
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		float[] marks1 = {0};
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println(marks[i]);
		}
		
	}

}
