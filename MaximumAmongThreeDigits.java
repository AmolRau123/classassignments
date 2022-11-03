package basicprogram;
import java.util.Scanner;
public class MaximumAmongThreeDigits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num1,num2,num3,max;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Three Numbers");
		num1=scan.nextInt();
		num2=scan.nextInt();
		num3=scan.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				//System.out.println(num1+"is greater");
				max=num1;
			}
			else
			{
				//System.out.println(num3+"is greater");
				max=num3;
			}
		}
		else
		{
			if(num2>num3)
			{
				//System.out.println(num2+"is greater");
			
				max=num2;
			}
			else
			{
				//System.out.println(num3+"is greater");
				max=num3;
			}
		}
		System.out.println("Maximum number among all three is:"+max);
	}

}
