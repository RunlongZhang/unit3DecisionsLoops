import java.util.Scanner;
public class Spectrum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number for wavelength: ");
        double c = 3.0e8;
        double frequency;
        double length = in.nextDouble();
        if (length > 1.0e-1)
        {
            frequency = c/length;
            System.out.println("This is a Radio Wave");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else if (length > 1.0e-3 && length < 1.0e-1)
        {
            frequency = c/length;
            System.out.println("This is a Microwave");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else if (length > 7.0e-7 && length < 1.0e-3)
        {
            frequency = c/length;
            System.out.println("This is a Infrared Wave");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else if (length > 4e-7 && length < 7e-7)
        {
            frequency = c/length;
            System.out.println("This is a Visible Light");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else if (length > 1.0e-8 && length < 4e-7)
        {
            frequency = c/length;
            System.out.println("This is a Ultraviolet Wave");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else if (length > 1.0e-11 && length < 1.0e-8)
        {
            frequency = c/length;
            System.out.println("This is a X-ray");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else if (length < 1.0e-11)
        {
            frequency = c/length;
            System.out.println("This is a Gamma ray");
            System.out.println("The frequency of this wave is " + frequency);
        }
        else
        {
            System.out.println("This wavelength does not exist");
        }
    }
}
// 3.0e8/wavelength = frequency