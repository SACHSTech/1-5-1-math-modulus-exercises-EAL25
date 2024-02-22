import java.math.MathContext;

class Km_to_miles extends ConsoleProgram {

  /**
  * Description: Write a program that will convert km to miles
  * @author: Evelyn A.L.
  */
  
  public void run() {
    // declare variables
    double kilometers;
    double miles;

    //input km
    kilometers = readDouble("Enter the number of kilometers: ");

    //convert to miles
    miles = kilometers/0.621371;

    //output results
    System.out.println("The miles that will be converted from km is: " + miles);
    
  }
}
