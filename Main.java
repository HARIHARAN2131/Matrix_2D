import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		Scanner scanner = new Scanner(System.in);
		int array1[][] = new int[3][3];
		int array2[][] = new int[3][3];
		System.out.println("Enter the 1st Matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("array1["+i+"]["+j+"] : ");
			array1[i][j]=scanner.nextInt();
			}
			System.out.println("");
		}
		System.out.println("Enter the 2nd Matrix : ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("array2["+i+"]["+j+"] : ");
			array2[i][j]=scanner.nextInt();
			}
			System.out.println("");
		}
		matrix.matrixAddition(array1, array2);
		matrix.matrixMultiplication(array1, array2);
		scanner.close();
	}
}


