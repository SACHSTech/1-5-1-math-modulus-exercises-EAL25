class Cos3rd extends ConsoleProgram {

  /**
  * Description: Find the missing side of a triange. 
  * @author: Evelyn A.L.
  */
  
  public void run() {

    //declare a variable
    double triange;
    double triangle2;
    double cosine;
    double trianglelength;
    
    // Enter two sides of the triangle with the degree included. 
    triange = readDouble("Enter one of the length of the triangle: ");
    triangle2 = readDouble("Enter the length of the second triangle: ");
    trianglelength = triange + triangle2;


    // Use cosine law to calculate the third side
    cosine =  Math.cos(trianglelength);

    //output results
   System.out.println("The cosine law to the third side of the triangle is: " + cosine + "after inputing. ");
  }
}