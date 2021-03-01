//17. WAP to convert decimal to binary and find out whether the no. is palindrome.

public class DeciBinPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(binaryPalindrome(5));
		
	}
	
	static boolean binaryPalindrome(int n) {
		String bin = Integer.toBinaryString(n);
		int i = 0;
		int j = bin.length()-1;
		while(i<j) {
			if(bin.charAt(i) == bin.charAt(j)) {
				;
			}
			else {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
		
		
}

