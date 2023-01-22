import java.util.Scanner;

class Xylem{
	static Scanner sc = new Scanner (System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number = ");
		int n = sc.nextInt();
		int s1=0,s2=0;

		for(int i=n; i>0; i/=10){
			if(i==n || i<=9)
				s1+=i%10;
			else 
				s2+=i%10;
				
		}
		if(s1==s2)
			System.out.println(n+" is a Xylem Number");
		else 
			System.out.println(n+" is not a Xylem Number");
	}
}