//14. WAP to calc ulate Factorial of a number

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(3));
	}
	
	static int factorial(int n) {
		int answer = 1,i=2;
		while(i<=n) {
			answer = answer*i;
			i++;
		}
		return answer;
	}

}
