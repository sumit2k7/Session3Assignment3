import java.util.Scanner;
import java.util.Random;
public class Session3Assignment3 {

	public static void main (String args[])
	{
		int iNumber=0;
		System.out.println("Please Enter a Number ");
		Scanner sc=new Scanner(System.in);
		iNumber=sc.nextInt();
		sc.close();
		GenerateRandom gr=new GenerateRandom();
	System.out.println("Random Number Between 0 and "+(iNumber-1)+ " is :->"+ 	gr.GenerateNo(0,(iNumber-1)));
	}
}

class GenerateRandom
{
	public int GenerateNo(int Start,int End)
	{
		Random r = new Random();
		int i1 = r.nextInt( End-Start);
		return i1;
	}
	}