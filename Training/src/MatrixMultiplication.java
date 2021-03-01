//9. WAP to find out quadratic equation WAP to perform matrix multiplication

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		;
}
	
	static int [][] matrixMult(int [] [] arr1, int[][] arr2){
			int [][] product = new int[arr1.length][arr2[0].length];
			for(int i=0;i<arr1.length;i++) {
				for(int j=0;j<arr2[0].length;j++) {
					for(int k=0;k<arr1[0].length;k++) {
						product[i][j]+=arr1[i][k]*arr2[k][j];
					}
				}
			}
			return product;
	}

}
