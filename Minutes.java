class Minutes extends ConsoleProgram {

  /**
  * Description: Write a program that will convert the number of minutes into # of days, hours, minutes. 
  * @author: Evelyn A.L.
  */
  
  public void run() {
    
    //declare a variable
    double minutes;
    double hours;
    double days;

    //input number of minutes
    minutes = readDouble("Enter the number of minutes that you would like to convert: ");

    //conversion
    hours = minutes*60;
    days = hours*24;

    //output results
    System.out.println("From converting # of minutes into days/hours/minutes, you will get: " + days);
  }
}