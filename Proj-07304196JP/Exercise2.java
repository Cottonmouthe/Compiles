import java.util.Scanner;

public class Exercise2
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a money: ");
     int money = input.nextInt();
     System.out.println("Your money is: "+ money);

     input.close();

     if (money <= 1000)
      {
       int thousands = money / 1000;
       money %= 1000;
       System.out.println("Thousand's: "+ thousands);
      }
      if (money == 500)
      {
        int fivehundred = money/500;
        money %= 500;
        System.out.println("Fivehundred's: "+ fivehundred);
      }
      if (money >= 200)
      {
        int twohundred = money/200;
        money %= 200;
        System.out.println("Twohundred's: "+ twohundred);
      }
      if (money >= 100)
      {
        int onehundred = money/100;
        money %= 100;
        System.out.println("Onehundred's: "+ onehundred);
      }
      if (money >= 50)
      {
        int fifty = money/50;
        money %= 50;
        System.out.println("Fifty's: "+ fifty);
      }
      if (money >= 20)
      {
        int twenty = money/20;
        money %= 20;
        System.out.println("Twenty's: "+ twenty);
      }
      if (money >= 10)
      {
        int ten = money/10;
        money %= 10;
        System.out.println("ten's: "+ ten);
      }
      if (money >= 1)
      {
        int one = money/1;
        money %= 1;
        System.out.println("One's: "+ one);
      }
    }
}
