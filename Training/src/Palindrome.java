//1. WAP to find out whether number is palindrome number

public class Palindrome {
	public static void main(String [] args) {
		boolean answer = numIsPalindrome(1221);
		System.out.println(answer);
	}
	
	public static boolean numIsPalindrome(int n){
		String n_str = Integer.toString(n);
		int i = 0;
		int j = n_str.length()-1;
		while(i<j) {
			if(n_str.charAt(i) == n_str.charAt(j)) {
				;
			}
			else {
				return false;
			}
			i=i+1;
			j=j-1;
		}
		return true;
	}
}
