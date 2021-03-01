//20. WAP to find out how many one digit two digit and three digit no. in array.

public class DigitLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,23,4,567,5,45,678,1,2,3};
		digitLength(arr);
	}
	
	static void digitLength(int [] arr) {
		int ones=0,twos=0,threes=0;
		for(int digit:arr) {
			String digString = Integer.toString(digit);
			if(digString.length()==1) {
				ones++;
			}
			else if(digString.length()==2) {
				twos++;
			}
			else if(digString.length()==3) {
				threes++;
			}
		}
		System.out.println("The number of one-digit items: " + ones);
		System.out.println("The number of two-digit items: " + twos);
		System.out.println("The number of three-digit items: " + threes);
	}

}
