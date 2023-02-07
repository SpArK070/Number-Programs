import java.util.*;

class PallindromeRecurssion{
	
	static Scanner sc = new Scanner(System.in);
	static int val,rev;

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();

		pallindrome(num);

		if(rev==num)
			System.out.println(num+" is a Pallindrome Number");
		else
			System.out.println(num+" is not a Pallindrome Number");

	}

	public static void pallindrome(int a){
		if(a>0){
			val = a%10;
			rev=(rev*10)+val;
			a/=10;
			pallindrome(a);
		}
	}
}