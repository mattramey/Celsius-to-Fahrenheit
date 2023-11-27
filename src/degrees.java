import java.util.Scanner;

public class degrees {
    public static void main(String[] args) 
     {
        System.out.println("Please enter degrees in Celsius");

        try (// intantiate scanner class
        Scanner input = new Scanner(System.in)) {
            // retreive celsius from input
            double celsius = input.nextDouble();

            //calculate fahrenheit = (9 / 5) * celsius + 32
            double fahrenheit = (celsius * 9 / 5) + 32; 


            // print out the conversion
            System.out.println("Fahrenheit = " + fahrenheit);
        }
        





    }
}
