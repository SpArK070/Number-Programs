import java.util.Scanner;

class NumberProgram
{
	static Scanner sc = new Scanner(System.in);
	static boolean b = true;

	public static void main (String [] args) {
		do{
			System.out.println("\t\t\t***********Welcome to Number Program***********");
			System.out.println("Select the Program\n---------------------------------");
			System.out.println("1.Prime Number\n2.Fibonacci Number\n3.Pallinadrome Number\n4.Armstrong Number\n5.Xylem Number\n6.Strong Number\n7.Largest of Three Numbers\n8.Perfect Number\n9.Factors\n10.Exit");
			System.out.println("---------------------------------");
			int input = sc.nextInt();

			switch (input){
			case 1:{
				System.out.println("\t\t######### Welcome to Prime Number #########");
				PrimeNumber.main(args);
				break;}
			case 2:{
				System.out.println("\t\t######### Welcome to Fibonacci Number #########");
				Fibonacci.main(args);				
				break;}
			case 3:{
				System.out.println("\t\t######### Welcome to Pallindrome Number #########");
				Pallindrome.main(args);
				break;}
			case 4:{
				System.out.println("\t\t######### Welcome to Armstrong Number #########");
				Armstrong.main(args);
				break;}
			case 5:{
				System.out.println("\t\t######### Welcome to Xylem Number #########");
				Xylem.main(args);
				break;}
			case 6:{
				System.out.println("\t\t######### Welcome to Strong Number #########");
				Strong.main(args);
				break;}

			case 7:{
				System.out.println("\t\t######### Welcome to Largest Number #########");
				Largest.main(args);
				break;}
			case 8 :{
				System.out.println("\t\t######### Welcome to Perfect Number #########");
				Perfect.main(args);
				break;}
			case 9:{
				System.out.println("\t\t######### Welcome to Factors Number #########");
				Factors.main(args);
				break;}
			case 10:{
				System.out.println("\t\t************** ThankYou **************");
				b=false;
				break;}
			default :{
				System.out.println("Input MisMatch Please Enter the Correct Input");
			}
			}

		}while(b);
		
	}
		
}