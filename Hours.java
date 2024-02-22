class Hours extends ConsoleProgram {

  /**
  * Description: Write a program that will convert hours into days and hours
  * @author: Evelyn A.L.
  */
  
  public void run() {
    
    // Declare variables
    double hours;
    double days;

    // Input # of hours
    hours = readDouble("Enter the numbers of hours that you would like to convert: ");

    // Convert hours into X days, X hours
    days = hours/24;

    //output results
    System.out.println("The number of hours that you have inputted will convert to: " + days);
    
  }
}