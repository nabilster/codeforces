import java.util.Scanner;

public class answer {

	static Long result=0L;;
	public answer() {

	}

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
		Long i= n+1;

		if(n>=1 && k<=Math.pow(10,9)){
			while(i>n){
				if(i%k==0){
					result=i;
					break;
				}
				else{
					i++;
				}
			}
		}
		System.out.println(i);
	}

	public static void main(String[] args){
		String[] inputval=input();
		process(inputval);

	}
}