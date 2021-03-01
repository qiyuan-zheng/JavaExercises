//5. WAP to convert decimal to binary vice versa

public class Binary {
	public static void main(String [] args) {
		System.out.println(bin_to_deci(10));
		deci_to_bin(64);
	}
	
	static int bin_to_deci(int binary) {
		int answer = 0;
		String binstring = Integer.toString(binary);
		int power = 0;
		for (int i= binstring.length(); i>0;i--) {
			if(Character.getNumericValue(binstring.charAt(i-1)) == 0){
				;
			}
			else {
				answer = (int) (answer + Math.pow(2, power));
			}
			power++;
		}
		return answer;
	}
	
	static void deci_to_bin(int n) {
		int[] binaryNum = new int[1000]; 
		int i = 0; 
        while (n > 0)  
        { 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
		}
}
