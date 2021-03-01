//WAP to find out whether number is Armstrong number

public class Armstrong {
	public static void main(String [] args) {
		boolean answer = isArmstrong(123);
		System.out.println(answer);
	}
	
	public static boolean isArmstrong(int n) {
		int answer = 0;
		String n_str = Integer.toString(n);
		for(int i=0; i<n_str.length(); i++){
			answer = answer + Character.getNumericValue(n_str.charAt(i)); 
		}
		return answer==n;
	}

}
