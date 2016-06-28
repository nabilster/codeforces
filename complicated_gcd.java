import java.util.Scanner;

public class answer {

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String[] input= sc.nextLine().split(" ");
		sc.close();
		
		//need to use strings, no representation of numbers greater than 64 bit
		String a= input[0];
		String b= input[1];
		
		//if strings are the same then the gcd is itself
		if (a==b){
			System.out.println(a);
		}
		
		// because need the one gcd for all a,a+1,a+2...b, there is only one gcd: 1
		else{
			System.out.println(1);
		}
	}
}