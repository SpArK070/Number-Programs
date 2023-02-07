import java.util.*;


class PerfectRecurssion{
	static Scanner sc = new Scanner (System.in);
	static int i=1,sum;

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int num = sc.nextInt();
		
		perfect(num);
		if(sum == num)
			System.out.println(num+" is a Perfect Number");
		else
			System.out.println(num+" is not a Perfect Number");
	}

	public static void perfect(int a){
		if(i<a){

			if(a%i==0){
				sum+=i;
			}
			i++;
			perfect(a);
		}
	}
}