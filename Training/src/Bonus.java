//10. WAP to decide bonus salary of an empl oyee base on No of years of experience and designation

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Your bonus is " + bonus(5,"Boss"));
	}
	
	static int bonus(int years, String designation){
		if(designation=="Boss") {
			return 1000*years;
		}
		else if(designation=="Intern") {
			return 0;
		}
		else {
			return 10*years;
		}
	}

}
