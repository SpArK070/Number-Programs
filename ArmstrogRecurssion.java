import java.util.*;

class ArmstrogRecurssion{
	
	static int c,sum,i=1,pow=1;
	static Scanner sc = new Scanner (System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();//153
		
		count(num);
		armstrong(num);
		if(sum ==  num)
			System.out.println("The entered number is an Armstrong Number");
		else
			System.out.println("The entered number is not an Armstrong Number");
		
	}

	public static void count(int a){
		if(a>0){
			c++;
			a/=10;
			count(a);
		}
	}

	public static void armstrong(int b){
		if(b>0){
			int val = b%10;
			sum+=power(val);		
			pow=1;
			i=1;
			b/=10;
			armstrong(b);
		}
	}
	
	public static int power(int n){
		
		if(i<=c){
			pow*=n;
			i++;
			power(n);
		}
		return pow;
	}
}