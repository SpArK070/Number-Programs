import java.util.Scanner;

class Logic
{
	static Scanner sc = new Scanner (System.in);
	static boolean b = true;

	public static void main (String [] args) throws Exception {
		do{
			System.out.println("\t\t\t***********Welcome to Logics World***********");
			System.out.println("Select the Program\n---------------------------------");
			System.out.println("1.Number Program\n2.Zepto\n3.About Creator\n4.Exit");
			System.out.println("---------------------------------");
			int user = sc.nextInt();

			switch (user)
			{
			case 1:{
				NumberProgram.main(args);
				break;}
			case 2:{
				Zepto.main(args);
				break;}
			case 3:{
				Creator.main(args);
				break;}
			case 4:{
				System.out.println("************** Thank You ***************");
				b=false;
				break;}
			default : {
				System.out.println("Input MisMatch Please Enter teh Correct Input ");
			}

			
			}
		}while(b);
	}
}