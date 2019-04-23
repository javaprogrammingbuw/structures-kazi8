import java.util.Scanner;


public class SumMeanMinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter three values");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("a: " + a + " b: " + b + " c: " + c + " :)");
		int sum, mean, min, max;
		sum=a+b+c;  
		System.out.println("sum is "+sum);  //System.out.println("sum is "+(sum=a+b+c));
		
		System.out.println("please enter 3:");
		int n= scan.nextInt();
		mean=(a+b+c)/n;
		System.out.println("Mean is "+mean);

		if(a>b){
			a=b;
		}
		if(a>c){
			a=c;
		}
		System.out.println("Minimum value is "+a);

		if(a<b){
			a=b;
		}
		if(a<c){
			a=c;
		}
		System.out.println("Maximum value is "+a);


/*
//finding Min
int min;
if(a<=b && a<=c){
	min=a;
}
else if(b<=c && b<=a){
	min=b;
}
else{
	min=c;
}
//finding max
int max;
if(a>=b && a>=c){
	max=a;
}
else if(b>=c && b>=a){
	max=b;
}
else{
	max=c;
}
*/
		/*
		 * Todo: Print the sum, mean, max Value and min Value of a, b and c.
		 * */
		

	}

}
