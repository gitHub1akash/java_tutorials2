package array;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("enter the dimensions");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		
		int a[][] = new int [rows][cols];
		int b[][] = new int [rows][cols];
		
		System.out.println("enter the array 'a' ");
		for(int i=0; i<rows; i=i+1) {
			for(int j=0; j<cols; j=j+1) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter the array 'b' ");
		for(int i=0; i<rows; i=i+1) {
			for(int j=0; j<cols; j=j+1) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int [rows][cols];
		
		for(int i=0; i<rows; i=i+1) {
			for(int j=0; j<cols; j=j+1) {
				c[i][j] = a[i][j] + b[i][j] ;
			}
		}
		
		for(int i=0; i<rows; i=i+1) {
			for(int j=0; j<cols; j=j+1) {
				System.out.print(c[i][j]  + "  ");;
			}
			System.out.println();
		}
		
		
		
	}

}
