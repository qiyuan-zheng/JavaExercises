//program to find solutions of quadratic eq

public class QuadraticEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quad(1.00000f,0.00000f,-4.00000f);

	}
	
	static void quad(float a, float b, float c){
		double answer1 = (-b + Math.pow(Math.pow(b, 2)-4*a*c, .5))/2*a; 
		double answer2 = (-b - Math.pow(Math.pow(b, 2)-4*a*c, .5))/2*a; 
		System.out.printf("The first root is %f.\n", answer1);
		System.out.printf("The second root is %f.\n", answer2);
	}

}
