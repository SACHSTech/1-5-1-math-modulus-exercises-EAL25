class Power extends ConsoleProgram {

  /**
  * Description: Write a progrem that will print out a^b when entered a,b
  * @author: Evelyn A.L.
  */
  
  public void run() {
    
    // declare a variable
    double a;
    double b;
    double printout;

    //input the numbers of a and b
    a = readDouble("Enter the first number: ");
    b = readDouble("Enter the second number: ");

    //number prints out as a^b
    printout = Math.pow( a, b);

    //output results
    System.out.println("The number after inputting a and b would be: " + printout);
    
  }
}