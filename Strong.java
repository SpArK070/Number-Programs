import java.util.*;

class Strong{
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int n = sc.nextInt();
		
		int sum=0;
		for(int i=n; i>0; i/=10){
			int fact=1;
			for(int j=1; j<=i%10; j++){
				fact*=j;
			}
			sum+=fact;
		}
		if(sum == n)
			System.out.println(n+" is a Strong Number");
		else 
			System.out.println(n+" is not a Strong Number");
	}
}