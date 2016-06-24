import java.util.Scanner;

public class answer {

	static Long result=0L;

	public static String[] input(){

		Scanner sc= new Scanner(System.in);

		String input= sc.nextLine();
		sc.close();

		// split input
		String[] inputsNK=input.split(" ");
		return inputsNK;
	}

	public static void process(String[] input){

		Long n= Long.parseLong(input[0]);
		Long k= Long.parseLong(input[1]);
		Long i= k;
		Long count=1L;
		Long result=0L;

		if(n>=1 && k<=Math.pow(10,9)){
			if (k>n){
				result=k;
			}

			else{
				while (result<=n){	
					result=i*count;
					count++;
				}
			}
		}
		System.out.println(result);
	}

	public static void main(String[] args){

		String[] inputval=input();
		process(inputval);

	}
}