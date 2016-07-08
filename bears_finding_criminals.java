import java.util.Arrays;
import java.util.Scanner;

public class answer2 {

	static int numberofcities= 0;
	static int cityliving=0;

	public static String[] input(){

		Scanner sc= new Scanner (System.in);
		String[] input= sc.nextLine().split(" ");
		String[] input2= sc.nextLine().split(" ");
		sc.close();

		numberofcities= Integer.parseInt(input[0]);
		cityliving= Integer.parseInt(input[1]);

		return input2;	

	}
	public static void process(String[] cities){

		int even=0;
		int center= numberofcities/2; //center of all cities, one of two if odd
		int offset=0; // offset in both directions of cityliving

		//even is 1
		if (numberofcities%2==0){
			even=1;
		}

		//if even
		if(even==1){

			if(cityliving<=center){
				offset=cityliving-1;
			}
			else{
				offset=numberofcities-cityliving;
			}
		}
		//if odd
		else{
			center=center+1;

			if(cityliving==center){
				offset=numberofcities/2;


			}
			else if (cityliving<center){
				offset= cityliving-1;


			}
			else{
				offset=numberofcities-cityliving;

			}
		}
		//find direction of offset
		int toright=0;
		int toleft=0;

		if(cityliving<=center){
			toright=1;
		}
		else{
			toleft=1;	
		}

		int counter=0;


		if (offset==0){
			counter++;
		}

		int at= Integer.parseInt(cities[cityliving-1]);
		if (at==1){
			counter++;
		}

		for (int i=1; i<=offset;i++){
			int above=Integer.parseInt(cities[(cityliving-1)+i]);
			int below=Integer.parseInt(cities[(cityliving-1)-i]);

			if (above==1 && below==1){
				counter=counter+2;
			}
		}


		if(toright==1){
			int location= cityliving+offset;

			for(int i=location; i<numberofcities;i++){
				if(Integer.parseInt(cities[i])==1){
					counter++;
				}
			}
		}
		else if(toleft==1){
			int location= (cityliving-1)-offset-1;


			for (int i=location; i>=0;i--){

				if(Integer.parseInt(cities[i])==1){
					counter++;
				}
			}
		}
		System.out.println(counter);
	}

	public static void main(String args[]){
		String[] cities= input();
		process(cities);

	}
}