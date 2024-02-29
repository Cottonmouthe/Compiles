import java.util.Scanner;
public class MathExercise
{
	public static void main(String[] args) 
	{
		System.out.println();
		
		double a;
		double b;
		double c;
		
		Scanner math = new Scanner(System.in);
		
		System.out.print("Side a: ");
		a = math.nextDouble();
		
		System.out.print("Side b: ");
		b = math.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("Side c: " + c);
		
		math.close();
		
	}

}