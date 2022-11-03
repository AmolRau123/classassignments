package basicprogram;
import java.util.Scanner;
public class FindMaximum {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println("Maximum:" +num1);
		}
		else
		{
			System.out.println("Minimum:" +num2);
		}
	}

}
// wap to check wheather the number is negative or positive
// wap to check wheather the number is character or number is zero