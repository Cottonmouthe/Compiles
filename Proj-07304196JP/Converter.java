import java.util.Scanner;
public class Converter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter a unit: ");
        double kilometer = input.nextDouble();
        double meter = kilometer*1000;

        //System.out.println(kilometer + " kilometer is " + meter + " meter");

        if (kilometer > 1)
        {
            System.out.println(kilometer + " kilometers is " + meter + " meters");
        }
        else if (kilometer <= 1)
        {
            System.out.println(kilometer + " kilometer is " + meter + " meters");
        }
    input.close();
    }
}