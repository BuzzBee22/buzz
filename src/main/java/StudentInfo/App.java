/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StudentInfo;
import javax.swing.JOptionPane;

public class App {
  
    public static void main(String[] args) {
    
     //this is how you declare
      String studentNumber;
      String Name;
      String Surname;
      String Email;
      String phoneNumber;
      int Test1;
      int Test2;
      int Assignment;
      int examMark;
      double DpMark;
      double finalMark;
      
     //this is how u set
      studentNumber = JOptionPane.showInputDialog(null, "Insert your student number:" );
      Name = JOptionPane.showInputDialog(null, "Insert your name");
      Surname = JOptionPane.showInputDialog(null,"Insert Surname");
      Email = JOptionPane.showInputDialog(null, "Insert your email");
      phoneNumber = JOptionPane.showInputDialog(null, "Enter your phone number");
      
     // all the strings should be done, moving on to the ints 
      Test1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Insert test 1 mark"));
      Test2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your test 2 mark"));
      Assignment = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your assignment mark"));   
      examMark = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your exam mark"));        
              
     //boolean to show if you achieved over 40 or not
     boolean examQualify = ((Test1+Test2+Assignment)/3) >=40 ;
     
     //moving onto the doubles, we don't ask for any inputs
      DpMark = (Test1+Test2+Assignment)/3;
      finalMark= (DpMark)*0.4 + (examMark)*0.6;
             
     // this is how you display
      String finalOutput = "Your results are as follows: "+ "\n" 
                                +"Student number: "+studentNumber + "\n"
                                +"Full name: " +Name+" "+Surname + "\n"
                                +"Email: "+Email +"\n"
                                +"Dp Status: "+ examQualify+"\n"
                                +"Final mark: "+ finalMark+"%";
      JOptionPane.showMessageDialog(null, finalOutput);
      
    }
}
