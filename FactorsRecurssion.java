import java.util.Scanner;

class FactorsRecurssion{
	static Scanner sc = new Scanner (System.in);
	static int start = 1;

	public static void main (String [] args){
		System.out.print("Enter the number = ");
		int num = sc.nextInt();
		
		System.out.println("\nThe Factors of the Given Number are :-");
		factor(num);
	}

	public static void factor(int i){
		if(start<i){
			if(i%start == 0){
				System.out.println(start);
			}
			start++;
			factor (i);
		}
	}
}