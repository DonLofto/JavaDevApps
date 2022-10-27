import java.util.Arrays;
import java.util.Scanner;// importing scanner class
import java.text.DecimalFormat;// importing decimal class

public class userInputs{
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("0.00"); //initialise Decimalformat function for formating the ticket prices displayed in output
        

        double[] userArray;// declaring user variable

        int arraySize = 0;
        double sum=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the Array:");
        arraySize=scan.nextInt(); 
        System.out.println("Enter the Array values here:"+df.format(userArray));
        userArray = new double[arraySize];
                for(int i=0; i<arraySize; i++)
        
            
        
        for (int i=0; i<userArray.length; i++);
            userArray[i] = scan.nextDouble();
            sum = sum + userArray[i];
        {
            
            System.out.println("Here are the Array input values:"Arrays.toString(userArray));
            System.out.println("Sum of Array input values;"+sum);

        }
        scan.close();
        }

    
    }
