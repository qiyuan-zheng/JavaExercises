//19. WAP to find out how many are even odd no., how many are prime, how many are Armstrong and palindrome.

public class Combo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,5,3,2,23,4,5};
		combo(arr);

	}
	
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static void combo(int [] arr) {
		int oddcount=0,evencount=0,primecount=0,armstrongcount=0,palindromecount=0;
		Palindrome p= new Palindrome();
		Armstrong a = new Armstrong();
		for(int n: arr) {
			if(n%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			if(a.isArmstrong(n)) {
				armstrongcount++;
			}
			if(p.numIsPalindrome(n)){
				palindromecount++;
			}
			if(isPrime(n)) {
				primecount++;
			}
		}
		System.out.println("The number of primes is"+ primecount);
		System.out.println("The number of palindromes is"+ palindromecount);
		System.out.println("The number of odds is"+ oddcount);
		System.out.println("The number of evens is"+ evencount);
		System.out.println("The number of Armstrongs is"+ armstrongcount);



	}
	
	

}
