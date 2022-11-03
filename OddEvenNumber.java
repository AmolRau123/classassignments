package basicprogram;
import java.util.Scanner;
public class OddEvenNumber {

	public static void main(String[] args) 
	{
		{	// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number to check even or odd");
		num=scan.nextInt();
		
		if(num%2==0)
			System.out.println(num+ " is even number");
		else
			System.out.println(num+ " is odd number");
			
		}

	}

}
