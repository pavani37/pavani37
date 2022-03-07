import java.util.Scanner;

public class Natnumrevn1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Maximum integer Value : ");
		number = sc.nextInt();	
		
		i = number;
		
		while(i >= 1)
		{
			System.out.print(i +" "); 
			i--;
		}	
	}
}