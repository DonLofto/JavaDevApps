import java.util.Scanner;// import scanner class

public class calc
{
   public static void main(String[] args)// initialise method
   {
    int input;// declaring int variable
      
      Scanner s = new Scanner(System.in);// init scanner class
      System.out.println("This application counts the number of digits in an integer entered by the user.");//prints statement
      System.out.println("To terminate this application, enter -1");// prints statement
     
      do {// init loop calling for user input and stores for processing
        
        System.out.print("\nEnter a Number: ");// prints statement
        
        input = s.nextInt();// input type int
        int num = input;
        int totalD = 0;
        
        while(num!=0)// initialising calculation and processes input
        {
            totalD++;
            num = num/10;

            
        }
        
        if(input != -1)// prints following output if user input is not -1
          System.out.println("The number of digits in " + input + " is "+ totalD );
        

    } while(input != -1);// prints following statement if user inputs -1
    
    
    System.out.println("Application Terminated"); // prints statement
    s.close();// close scanner

   }
}