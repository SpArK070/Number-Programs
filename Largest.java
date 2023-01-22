import java.util.Scanner;

class Largest{
	static Scanner sc = new Scanner (System.in);

	public static void main (String [] args){
		System.out.print("Enter the first number : ");
		int a= sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int b = sc.nextInt();
		System.out.print("Enter the Third Number : ");
		int c = sc.nextInt();

		if(a>b && a>c)
			System.out.println(a+" is the Largest Number");
		else if(b>c)
			System.out.println(b+" is the Largest Number");
		else
			System.out.println(c+" is the Largest Number");


	}
}