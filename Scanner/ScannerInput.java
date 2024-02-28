import java.util.Scanner;
public class ScannerInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Who is this?");
        String name = input.nextLine();

        if (name.equals("Bruce Wayne"))
        {
            System.out.println("You are the Batman!");
        }
        else if (name.equals("Tony Stark"))
        {
            System.out.println("You are the Ironman!");
        }
        else if (name.equals("Matt Murdock"));
        {
            System.out.println("You are the Devil of Hell's Kitchen!");
        }
    }
}