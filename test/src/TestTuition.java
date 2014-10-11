import javax.swing.JOptionPane;

public class TestTuition
{
  private static final int MAX_STUDENT_SIZE= 10;
  
  public static void main(String[] args)
  {
    Tuition [] studentTuition = new Tuition[MAX_STUDENT_SIZE];
    
    studentTuition[0] = new Tuition("John" ,false, 4 );
    
    JOptionPane.showMessageDialog(null, studentTuition[0].getStudentTuition());
    
  
  }//end main
}//end class  
