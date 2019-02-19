/*
  Matthew Ludwig
  19 February 2019
  This program returns the rouding error when squaring and square -
  rooting a number
*/
package roundingerror;

/**
 *
 * @author malud0519
 */
import javax.swing.*;
public class RoundingError {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Asks user for a number
        String numStr = JOptionPane.showInputDialog("Please enter a number");
        //Converts the string into a double
        double inputNum = Double.parseDouble(numStr);
        
        //calculations
        double squareRoot = Math.sqrt(inputNum);
        double roundingError = (squareRoot)*(squareRoot);
        double roundOffError = (roundingError) - (inputNum);
        
        //Displays the result
        JOptionPane.showMessageDialog(null,"The square of the square = " + roundingError + "\n"+ " The round off error = " + roundOffError);     
    }
    
}
