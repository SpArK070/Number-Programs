import java.util.*;

class Factors{
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
	
		System.out.println("The Factors of the Given Numbers Are = ");
		for(int i=1; i<=n; i++){
			if(n%i == 0)
				System.out.println(i);
		}
	}
}