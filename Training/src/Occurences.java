import java.util.*;

//18. WAP to find out the no. of occurrence of each digit in a string
public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(occurences("112419977739645722").toString());

	}
	
	static Hashtable<Character, Integer > occurences(String s){
		Hashtable <Character,Integer> dict = new Hashtable<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			if(dict.containsKey(s.charAt(i))) {
				dict.put(s.charAt(i), dict.get(s.charAt(i))+1);
			}
			else {
				dict.put(s.charAt(i),1);
			}
		}
		return dict;
	}
}
