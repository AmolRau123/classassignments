package basicprogram;
import java.util.Scanner;
public class TotalMarks {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      float mark1,mark2,mark3,mark4,mark5,Total,avg,percentage;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the mark1");
      mark1 =sc.nextFloat();
      System.out.println("Enter the mark2");
      mark2 =sc.nextFloat();
      System.out.println("Enter the mark3");
      mark3 =sc.nextFloat();
      System.out.println("Enter the mark4");
      mark4 =sc.nextFloat();
      System.out.println("Enter the mark5");
      mark5 =sc.nextFloat();
      Total=mark1+mark2+mark3+mark4+mark5;
      
      //total of marks
      System.out.println("The total of 5 subjects are: " +Total);
      avg =Total/5;
      System.out.println("The avg of total subjects are: " +avg);
      percentage=(Total / 500) * 100;
      System.out.println("The percentage of total subjects are: " +percentage+"%");
      
      if(Total>=300)
      {
    	  System.out.println("PASS");
      }
      else
      {
    	  System.out.println("FAIL");
      }
	}

}
