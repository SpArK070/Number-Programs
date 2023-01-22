import java.util.Scanner;

class Fibonacci{
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		System.out.print("Enter the First Number = ");
		int n1 = sc.nextInt();
		System.out.print("Enter the Second Number = ");
		int n2 = sc.nextInt();
		int n3=0;

		System.out.print(n1+" "+n2);
		for(int i=1; i<=8; i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}


	}

}