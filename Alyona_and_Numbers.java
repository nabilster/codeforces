import java.util.Scanner;

public class answer2 {

	static int firstcount0=0;
	static int firstcount1=0;
	static int firstcount2=0;
	static int firstcount3=0;
	static int firstcount4=0;
	
	static int secondcount0=0;
	static int secondcount1=0;
	static int secondcount2=0;
	static int secondcount3=0;
	static int secondcount4=0;
	
	public static String[] input() {
		// input number

		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		sc.close();

		// split input
		String[] columns=input.split(" ");

		return columns;
	}
	
	private static void sortmod1(int modval){
		if (modval==0){
			firstcount0++;
		}
		else if (modval==1){
			firstcount1++;
		}
		else if (modval==2){
			firstcount2++;
		}
		else if (modval==3){
			firstcount3++;
		}
		else if (modval==4){
			firstcount4++;
		}
	}
	
	private static void sortmod2(int modval){
		if (modval==0){
			secondcount0++;
		}
		else if (modval==1){
			secondcount1++;
		}
		else if (modval==2){
			secondcount2++;
		}
		else if (modval==3){
			secondcount3++;
		}
		else if (modval==4){
			secondcount4++;
		}
	}
	
	
	public static void process(String[] columns){

		// set columns as arrays
		int n=Integer.parseInt(columns[0]);
		
		for (int i=1; i<n+1; i++){
			int modval= i%5;
			sortmod1(modval);
		}
		
		int m= Integer.parseInt(columns[1]);	
		for (int i=1; i<m+1; i++){
			int modval=i%5;
			sortmod2(modval);
		}
		
		int pairs= (firstcount0*secondcount0)+(firstcount1*secondcount4)+(firstcount2*secondcount3)+(firstcount3*secondcount2)+(firstcount4*secondcount1);
		
		// print number of pairs
		System.out.println(pairs);
	}


	public static void main (String[] args){

		String[] inputval=input();
		process(inputval);

	}
}