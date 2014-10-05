public class Tuition
{
  private final double INSTATE = 150;
  private final double OUTSTATE = 355;
  private final double INFORMATIONFEE = 77;
  private static boolean resident = false;
  private static int numberOfStudents = 0;
  
  private String studentName;
  int numbOfCredits;
  
  Tuition(String newStudentName, boolean newResident, int newNumberOfCredits)
  {
    studentName= newStudentName;
    numbOfCredits= newNumberOfCredits;
    resident= newResident;
    numberOfStudents++;
    
  }
  public double getStudentTuition()
  {
    double tuition;
    if(resident)
    {
      tuition = numbOfCredits * INSTATE;
    }
    else
    {
      tuition = numbOfCredits *  OUTSTATE;
    }
    return tuition;
  }
    
  
}//end class