/*write a program to calculate simple interest*/
package basicprogram;

import java.util.Scanner;

public class SimpleInterest 
{
public static void main(String []args)
 {
	//declaring variables
  float principal,time,rate,si;	
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter principal amount");
  principal =sc.nextFloat();
  System.out.println("Enter time");
  time =sc.nextFloat();
  System.out.println("Enter rate");
  rate =sc.nextFloat();
  si=(principal*time*rate)/100;
     //calculate simple interest2
  System.out.println("Your simple interest is: " +si);
 }
}
