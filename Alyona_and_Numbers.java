import java.util.Scanner;

public class answer {

	public static String[] input() {
		// input number

		Scanner sc= new Scanner(System.in);
		String input= sc.nextLine();
		sc.close();

		// split input
		String[] columns=input.split(" ");

		return columns;
	}

	public static void process(String[] columns){

		// set columns
		int n=Integer.parseInt(columns[0]);
		int m= Integer.parseInt(columns[1]);	

		//find pairs
		int pairs=0;
		for (int i=1; i<n+1; i++){
			for(int j=1; j<m+1;j++){
				if ((i+j)%5==0){
					pairs++;
				}
			}
		}
		// print number of pairs
		System.out.println(pairs);
	}

	public static void main (String[] args){

		String[] inputval=input();
		process(inputval);

	}

}