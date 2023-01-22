import java.util.*;

class Armstrong{
	static Scanner sc = new Scanner (System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int n = sc.nextInt();
		
		int count=0;
		for(int i=n; i>0; i/=10){
			count++;
		}
		
		int prod=1;
		int sum = 0;
		for(int num = n; num>0; num/=10){
			for(int j=1; j<=count; j++){
				prod*=num%10;
			}
			sum+=prod;
			prod=1;
		}
		if(sum == n)
			System.out.println(n+" is a Armstrong Number");
		else 
			System.out.println(n+" is not a Armstrong Number");
	}
}