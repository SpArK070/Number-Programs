import java.util.Scanner;

class Pallindrome{
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int n = sc.nextInt();
		
		int rev = 0;
		for(int i=n; i>0; i/=10){
			rev*=10;
			rev+=i%10;
		}
		if(rev == n)
			System.out.println(n+" is a Pallindrome Number");
		else 
			System.out.println(n+" is not a Pallindrome Number");
	}
}