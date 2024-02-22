class AreaSin extends ConsoleProgram {

  /**
  * Description: Find the area of a triangle 
  * @author: Evelyn A.L.
  */
  
  public void run() {
    //declare a variable
    double triangle;
    double triangle2;
    double trianglelength; 
    double total;
    double degree;
    double sinC;

    // Multiple the two sides of the triangle together 
    triangle = readDouble("Enter one of the lengths of the triangle: ");
    triangle2 = readDouble("Enter the second length of the triangle: ");
    trianglelength = triangle * triangle2;
    degree = readDouble("Add in the degree of the triangle: ");
    total = trianglelength + degree;


    //use sinC with the two sides of the triangle
    sinC = Math.sin(total)/2;

    //output results
    System.out.println("The total area of the triangle is: " + sinC);
    
  }
}