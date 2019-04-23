import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the 1st value");
		int a = scan.nextInt();
		System.out.println("please enter the 2nd value and where the value should be between 1 to 9");
		int b = scan.nextInt();

		if(b>0 && b<10){
		int result = a%b;
		
			switch (result){
				case 1:
					System.out.println("one");
					break;
				case 2:
					System.out.println("two");
					break;
				case 3:
					System.out.println("three");
					break;
				case 4: 
					System.out.println("four");
					break;
				case 5: 
					System.out.println("five");
					break;
				case 6:
					System.out.println("six");
					break;
				case 7:
					System.out.println("seven");
					break;
				case 8:
					System.out.println("eight");
					break;
				case 9:
					System.out.println("nine");
					break;
				case 10:
					System.out.println("ten");
					break;
				default: 
					System.out.println("not found");
					break;

			}
		}
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

	}

}
