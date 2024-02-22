class FtoC extends ConsoleProgram {

  /**
  * Description: A program that will convert Fahrenheit into celcius. 
  * @author: Evelyn A.L.
  */
  
  public void run() {
    
    // Declare variables
    double farenheit;
    double converted; 

    //Enter in farenheit
    farenheit = readDouble("Enter the degrees in farenheit: ");



    //Convert fahrenheit to celcius by using the formula of C = 5/9(f-32)
    converted = 5/9 * (farenheit-32);
    

    //output results
    System.out.println("The final temperature in celcius from fahrenheit is: " + converted );
  }
}