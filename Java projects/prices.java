import java.util.Scanner; //importing scanner class
import java.text.DecimalFormat;// importing DecimalFormat class


    
    public class prices {
    //This is a class taking integer format number of tickets sold for type A&B&C tickets and double format A&B&C ticket prices as input, 
    //producing table format summary of number of tickets sold for each ticket type and a total sales value as output
    //No exception throwing mechanism is set up if undesired formatted inputs were entered
        public static void main(String[] args) {   //declaring and initializing the main function of the class
      
        
        DecimalFormat df = new DecimalFormat("0.00"); //initialise Decimalformat function for formating the ticket prices displayed in output
        
       
        Scanner scan = new Scanner(System.in); //initialise Scanner function
            
        
        int ticketA, ticketB, ticketC;//declare variables types assuming numbers of tickets sold should be integers
        Double priceA, priceB, priceC, totalSales;

        System.out.println("Enter number of A seats sold:");  //Prints guidance of input needed
        ticketA = scan.nextInt();// Stores the input
        
        System.out.println("Enter price of A tickets:");
        priceA = scan.nextDouble();

        System.out.println("Enter number of B seats sold:");
        ticketB = scan.nextInt();

        System.out.println("Enter price of B tickets:");
        priceB = scan.nextDouble();

        System.out.println("Enter the number of C seats sold");
        ticketC = scan.nextInt();

        System.out.println("Enter price of C tickets:");
        priceC = scan.nextDouble();

    
        
        totalSales = ticketA * priceA + ticketB * priceB + ticketC * priceC; // Calculates total sales
        
        //Formatting and printing the outputs    
        System.out.print("\n \t \t Tickets Sold \t Price per Ticket"); 
        System.out.println("\n  \t \t ------------ \t ------------");
        System.out.println("A Tickets: \t     "+(ticketA)+"\t     "+df.format(priceA));
        System.out.println("B Tickets: \t     "+(ticketB)+"\t     "+df.format(priceB));
        System.out.println("C Tickets: \t     "+(ticketC)+" \t      "+df.format(priceC));
        System.out.println("\n \t Total Sales €"+df.format(totalSales));
        scan.close();

            
    
            }
        
        }
            




            
        
         
        