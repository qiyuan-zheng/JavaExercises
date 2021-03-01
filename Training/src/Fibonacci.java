//4. WAP to print Fibonacci series

public class Fibonacci {
	public static void main(String [] args) {
		print_fib(10);
	}
	
	static void print_fib(int n) {
		int t1 = 0;
		int t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
        	if(i!=10) {
	            System.out.print(t1 + " + ");
        	}
        	else {
        		System.out.print(t1);
        	}
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
	}
}
