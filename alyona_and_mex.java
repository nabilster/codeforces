import java.util.Scanner;
import java.util.Arrays;


public class answer {
	static int inputarraysize=0;
	
	public static Integer[] inputArray() {
		// input number array size
		Scanner sc= new Scanner(System.in);
		String size= sc.nextLine();
		String array= sc.nextLine();
		sc.close();
		
		inputarraysize= Integer.parseInt(size);	
		String[] inputStringArray= array.split(" ");
		if (inputarraysize!=inputStringArray.length){
			System.out.println("Error");
			return null;
		}
		else{
			Integer[] inputIntArray= new Integer[inputarraysize];
			for(int i=0; i<inputarraysize;i++){
				inputIntArray[i]=Integer.parseInt(inputStringArray[i]);
			}
			return inputIntArray;
		}
		
	}
	
	public static void process(Integer[] inputIntArray){
		
		//sorting input integer array
		Arrays.sort(inputIntArray);
		
		//see if value greater than counter, if so add to counter, if not skip
		int counter=0;
		for(int i=0; i<inputarraysize;i++){
			if(inputIntArray[i]>counter){
				counter++;
			}
		}
		System.out.println(counter+1);
		
	}

	public static void main(String args[]){
		Integer[] inputArray=inputArray();
		process(inputArray);
		
		
	}


}