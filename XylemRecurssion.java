import java.util.*;

class XylemRecurssion {
	
	static int sum_fl, sum_mean;
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
	
	System.out.print("Enter the Number = ");
	int num = sc.nextInt();
	boolean res = xylem(num,num);
	
	if(res)
		System.out.println("The Entered number is a Xylem Number");
	else 
		System.out.println("The Entered Number is not a Xylem Numer");

	}

	public static boolean xylem(int n,int temp){
		
		if(n>0){
			if(n==temp || n<=9){
				sum_fl+=n%10;
				n/=10;
				xylem(n,temp);
			}
			else{
				sum_mean += n%10;
				n/=10;
				xylem(n,temp);
			}
			
		}
		boolean res = (sum_fl == sum_mean)?true:false;

		return res;
	}
}
