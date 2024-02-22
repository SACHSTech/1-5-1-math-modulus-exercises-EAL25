class Rads extends ConsoleProgram {

  /**
  * Description: A program that can convert degree measures into radian measure
  * @author: Evelyn A.L
  */
  
  public void run() {

    //declare a variable
    double dblRadius;
    double degree;
    double radian;


    //get degree
    degree = readDouble("Enter the degree: ");

    //multiple the degree by PI/180
    radian = degree * Math.toRadians (degree);

    //output results
    System.out.println("The radian measure is " + radian + " after converting from degree. ");
    
  }
}