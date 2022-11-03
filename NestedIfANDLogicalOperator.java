package basicprogram;
import java.util.Scanner;
public class NestedIfANDLogicalOperator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num1,num2,num3,max=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three numbers");
		num1=scan.nextInt();	//200
		num2=scan.nextInt();	//100	
		num3=scan.nextInt();	//80

		if((num1>num2)&&(num1>num3))
			max=num1;
		else if((num2>num3)&&(num2>num1))
			max=num2;
		else if((num3>num1)&&(num3>num2))
			max=num3;
		System.out.println("maximum among all three:"+ max);
}
}