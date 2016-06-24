import java.util.Scanner;

public class moreefficientanswer {

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

		Long result= ((n/k)+1)*k;

		System.out.println(result);
	}

	public static void main(String[] args){

		String[] inputval=input();
		process(inputval);

	}
}