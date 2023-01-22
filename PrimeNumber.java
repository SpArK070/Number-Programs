import java.util.*;

class PrimeNumber{
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		int count=0;
		for(int i= 1; i<=num; i++){
			if(num%i == 0)
				count++;
		}
		if(count == 2)
			System.out.println(num+" is a Prime Number \n");
		else
			System.out.println(num+" is Not a Prime Number \n");


	}
}