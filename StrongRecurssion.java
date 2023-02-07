import java.util.*;

class StrongRecurssion{
	static int sum,prod=1,val;
	static Scanner sc = new Scanner (System.in);
	
	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int n = sc.nextInt();

		strong (n);

		if(n==sum)
			System.out.println("The Entered Number "+n+" is a Strong Number");
		else
			System.out.println("The Entered Number "+n+" is not a Strong Number");
	}

	public static void strong (int a){
		if(a>0){
			val = a%10;
			
			sum+=fact(val);
			prod =1; 
			strong(a/=10);

		}
	}
	
	//factorial
	public static int fact (int b){
		if(b>1){
			prod*=b;
			b--;
			fact(b);
		}
		return prod;
	}
}