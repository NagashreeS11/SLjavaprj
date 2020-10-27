package BasicOps;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Yes or No");
		char resp = s1.nextLine().charAt(0);
		if (resp== 'y')
		{
			System.out.println("You entered Yes");
		}
		else
		{
			System.out.println("You entered No");
		}
		s1.close();
			
	}

}
