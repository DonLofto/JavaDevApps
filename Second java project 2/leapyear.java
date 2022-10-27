import java.util.Scanner; // Import the Scanner class

public class leapyear {

  public static void main(String[] args) { // Initialises method
    
    Scanner scan = new Scanner(System.in); // Make scanner object

    System.out.println("What year would you like to check? ");//prints statement

    int year = scan.nextInt(); //Reads user input
    
    queryLeapYear(year);//Processes user input for calculation
    
    scan.close();// closes Scanner Object
    
}

  public static void queryLeapYear(int year) { // Method to check leap year
        if (year % 400 == 0) { //checks if year is divisible by 400
          System.out.println(year + " is a Leap Year");//prints year with statement
          } 
        
          else if (year % 100 == 0) {//checks if the year is a century or not
          System.out.println(year + " is Not a Leap Year");//prints year with statement
          } 
        
          else if (year % 4 == 0) {// checks if year is divisible by 4
          System.out.println(year + " is a Leap Year");//prints year with statement
          } 
         
          else {//checks otherwise
          System.out.println(year + " is Not a Leap Year");//prints year with statement
          }
        }
      }
    
      