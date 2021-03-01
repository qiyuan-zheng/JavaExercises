//7. WAP swap to numbers without using third variable

public class Swap {
	public static void main(String [] args) {
		int x=3, y=5;
		swap(x,y);
	}
	
	static void swap(int x, int y) {
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        System.out.println("After swaping:"
	                           + " x = " + x + ", y = " + y);
	    }

}
