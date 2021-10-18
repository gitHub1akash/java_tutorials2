package array;

import java.util.Scanner;

public class AverageMarksOfStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of students");
		
		int n = sc.nextInt();
		
		int marks [] = new int[n];
		
		int sumOfMarks = 0;
		
		System.out.println("enter the marks now");
		
		for(int i = 0; i<n; i=i+1) {
			marks [i] = sc.nextInt();
			
		}
		
		for(int i = 0; i<n; i=i+1) {
			sumOfMarks += marks[i];
		}
		int average = sumOfMarks/ n;
		
		System.out.println("5the average mark of students is"+ average);

	}

}
