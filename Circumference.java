class Circumference extends ConsoleProgram {

  /**
  * Description: A program that computes the circumfrence of a circle given a radius from the user. 
  * @author: Evelyn. A.L.
  */
  
  public void run() {
    
    // declare variables
    double dblRadius;
    double dblCircumference;



    // get radius 
    dblRadius = readDouble("Enter the radius: "); 

    // calculate circumfrence
    dblCircumference = 2 * Math.PI * dblRadius;

    // output results
    System.out.println("The circumference of a circle with radius " + dblRadius + " is " + dblCircumference);

    
  }
}