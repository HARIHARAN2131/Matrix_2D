
public class Matrix {
	int[][] array3 = new int[3][3];
	
	
	void matrixAddition(int[][] array1, int[][] array2) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array3[i][j]=array1[i][j]+array2[i][j];
			}
		}
		
		System.out.println("Matrix Addition : ");
		for(int[] i: array3) {
			for(int j: i) {
			System.out.print(" "+j);
			}
			System.out.println("");
		}
	}
	
	
	
	void matrixMultiplication(int[][] array1,int[][] array2) {
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				array3[i][j]=0;
				for(int k=0;k<3;k++) {
				array3[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		
		System.out.println("Matrix Multiplication : ");
		for(int[] i: array3) {
			for(int j: i) {
			System.out.print(" "+j);
			}
			System.out.println("");
		}
	}
}
