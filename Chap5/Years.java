import java.util.Scanner;
public class Years
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number of days");
        int days = in.nextInt();
        if (days % 4 == 0 && days % 400 == 0)
        {
            System.out.println(days + " is a leap year");
        }
        else if (days % 100 == 0)
        {
            System.out.println(days + " is a leap year");
        }
        else
        {
            System.out.println(days + " is not a leap year");
        }
    }
}