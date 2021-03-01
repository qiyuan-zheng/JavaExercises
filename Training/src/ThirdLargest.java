//WAP to print 3'rd largest number in array

public class ThirdLargest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,1,2,1,2};
		System.out.println(third(arr));
	}
	
	static int third(int[] arr) {
		int first=0,second=0,third=0;
		for(int item : arr) {
			if(item>third) {
				if (item>second) {
					if(item>first) {
						third = second;
						second=first;
						first=item;
					}
					else {
						third = second;
						second=item;
					}
				}
				else {
					third = item;
				}
			}
		}
	return third;	
	}

}
