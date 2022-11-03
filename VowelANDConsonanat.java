package basicprogram;
import java.util.Scanner;
public class VowelANDConsonanat {

	public static void main(String[] args)
	{
		char ch='1';
		if((ch=='a'||ch=='A')||(ch=='e'||ch=='E')||(ch=='i'||ch=='I')||(ch=='o'||ch=='O')||(ch=='u'||ch=='U'))
			System.out.println(ch+"is vowel");
		else if((ch>=48)&&(ch<=57))
			System.out.println(ch+" is number");
		else 
			System.out.println(ch+" is consonant");
		
	}

}
