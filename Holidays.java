import java.util.Scanner;

public class answer {

	public static int Days() {
		// input number array size
		Scanner sc= new Scanner(System.in);
		Integer days= Integer.parseInt(sc.nextLine());
		return days;
	}
	
	public static void main(String args[]){
		//record of days in a year
		int daysInYear=Days();
		double min=(daysInYear/7)*2;
		double max=(Math.ceil(daysInYear/7.0))*2;
		
		//find max and min days off
		
			int valofweek=daysInYear%7;
			if (valofweek==1){
				max=-1+max;	
			}
			else if (valofweek==6){
				min=1+min;			
			}
		
		
		System.out.println(Math.round(min)+ " "+ Math.round(max));
	}
		

}