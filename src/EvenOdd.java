import java.util.Scanner;

//loops

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a value:");
		int n=scan.nextInt();

		System.out.println("printing odd numbers:");
		for(int i=1; i<=n; i++) {
			if(i%2!=0){
				System.out.println(i+"");
			}
		}

		System.out.println("printing even numbers:");
		for(int i=1; i<=n; i++){
			if(i%2==0){
				System.out.println(i+"");
			}
		}
		
		//todo: The program takes a number as input.
		//It then goes through all integer values till reaching that value and prints all the odd ones.
		
	}
	
}
