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
     * @param args
     */
    public static void main(String[] args) {
        //Asks user for a number
        String numStr = JOptionPane.showInputDialog("Please enter a number");
        //Converts the string into a double
        double inputNum = Double.parseDouble(numStr);
        
        //calculations
        double squareRoot = Math.sqrt(inputNum); // Square roots the input
        double roundingError = (squareRoot)*(squareRoot); //Squares the square root
        double roundOffError = (roundingError) - (inputNum); // returns the value of the rouding error 
        
        //Displays the result
        JOptionPane.showMessageDialog(null,"The square of the square = " + roundingError + "\n"+ " The round off error = " + roundOffError);     
    }
    
}
/*
 Since Java square roots the number prior to squaring the number, and Java 
 rounds this value, there is a margin for error. For instance, the square root of
 2 is roughly equal to 1.4. But, 1.4^2 != 2. Although, the rounding error is very
 small, which can be considered negligible.
 */
