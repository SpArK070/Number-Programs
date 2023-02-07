import java.util.*;

class PrimeRecurssion
{
	static Scanner sc = new Scanner (System.in);
	static int i = 1,count ;

	public static void main (String [] args){
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		int res = prime(num);
		
		if(res == 2)
			System.out.println("The Entered Number is a Prime Number");
		else
			System.out.println("The entered Number is not a prime Number");
	}

	public static int prime(int n){
		
		if(i<=n){
			if(n%i==0){
				count++;
			}
			i++;
			prime(n);
		}

		return count;
	}
}