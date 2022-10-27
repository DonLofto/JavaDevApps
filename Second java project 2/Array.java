import java.util.Arrays;//imports array class
import java.util.Scanner;// imports scanner class
import java.text.DecimalFormat;// imports DecimalFormat class

public class Array {

    public static void main(String[] args) {

        //initialise Decimalformat function for formating the ticket prices displayed in output
        DecimalFormat df = new DecimalFormat("0.0000"); 

        // Enter array size
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int num = scan.nextInt();
        
        
        //declaring array as type double
        double[] arr = new double[num];
        
        // Taking user input for array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number: ");
            double input = scan.nextDouble();
            arr[i] = input;
        }

        // Calculating the sum
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // prints array input values
        System.out.println("The numbers in the array are: "+ Arrays.toString(arr));
        
        // prints sum of the array input values and limits to two decimal places
        System.out.println("The sum of the numbers in the array is: " + df.format(sum));
        
        scan.close(); // closes Scanner
    }

}
