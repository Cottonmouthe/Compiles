import java.util.Scanner;

public class HoroscopeTarot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your birth year: ");

    String birth_year = input.nextLine();

    if (birth_year.equals("1992") || birth_year.equals("2004") || birth_year.equals("2016")) {
      System.out.println("You are year of the monkey. , you are generous, friendly, "
          + "and smart, you tend to be lazy but you are the best like no one ever was.");
    } else if (birth_year.equals("1999") || birth_year.equals("2011") || birth_year.equals("2023")) {
      System.out.println("You are year of the Rabbit");
    } else if (birth_year.equals("1991") || birth_year.equals("2003") || birth_year.equals("2015")) {
      System.out.println("You are year of the Goat");
    } else if (birth_year.equals("1993") || birth_year.equals("2005") || birth_year.equals("2017")) {
      System.out.println("You are year of the Rooster");
    } else if (birth_year.equals("1994") || birth_year.equals("2006") || birth_year.equals("2018")) {
      System.out.println("You are year of the Dog");
    } else if (birth_year.equals("2000") || birth_year.equals("2012") || birth_year.equals("2024")) {
      System.out.println("You are year of the Dragon");
    }

    input.close();
  }
}
