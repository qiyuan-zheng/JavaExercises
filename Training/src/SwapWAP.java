import java.util.Arrays;

public class SwapWAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,5,4,7,2,10,1};
		System.out.println(Arrays.toString(swapWAP(arr)));
	}
	
	static int[] swapWAP(int [] arr) {
		int i =0, j=arr.length-1,k=0;
		int [] answer= new int [arr.length];
		while(k<arr.length) {
			if(k%2==0) {
				answer[k]=arr[j];
				j--;
				k++;
			}
			else {
				answer[k]=arr[i];
				i++;
				k++;
			}
		}
		return answer;
	}

}
