//program that prints a triangle given a length

public class Shapes {
	public static void main(String [] args) {
		print_triangle(10);
	}
	
	static void print_triangle(int size){
		for(int i=1;i<=size;i++) {
			for(int j=0; j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
