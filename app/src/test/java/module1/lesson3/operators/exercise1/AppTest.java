/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package module1.lesson3.operators.exercise1;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.example.operators.doNotEdit.TextsToPrint;
import com.example.operators.editHere.OperatorLogic;

public class AppTest {

    @Test
    public void testWithAge15AndCitizenFalse() {
        TextsToPrint mockTextsToPrint = Mockito.mock(TextsToPrint.class);

        // Call the printOutput method with the mock
        OperatorLogic operatorLogic = new OperatorLogic(mockTextsToPrint);
        // getTextForAllowedToDoNothing should be called
        operatorLogic.printOutput(15, false);

        // Verify the correct methods were called
        verify(mockTextsToPrint).getTextForAllowedToDoNothing();
    }

    @Test
    public void testWithAge16AndCitizenTrue() {
        TextsToPrint mockTextsToPrint = Mockito.mock(TextsToPrint.class);
        // Call the printOutput method with the mock
        OperatorLogic operatorLogic = new OperatorLogic(mockTextsToPrint);
        operatorLogic.printOutput(16, true);

        // Verify the correct methods were called
        verify(mockTextsToPrint).getTextForAllowedToVote();
        verify(mockTextsToPrint).getTextForAllowedToVoteButNotDrive();
    }

    @Test
    public void testWithAge17AndCitizenFalse() {
        TextsToPrint mockTextsToPrint = Mockito.mock(TextsToPrint.class);
        // Call the printOutput method with the mock
        OperatorLogic operatorLogic = new OperatorLogic(mockTextsToPrint);
        operatorLogic.printOutput(17, false);

        // Verify the correct methods were called
        verify(mockTextsToPrint).getTextForAllowedToDoNothing();
    }

    @Test
    public void testWithAge18AndCitizenTrue() {
        TextsToPrint mockTextsToPrint = Mockito.mock(TextsToPrint.class);
        // Call the printOutput method with the mock
        OperatorLogic operatorLogic = new OperatorLogic(mockTextsToPrint);
        operatorLogic.printOutput(18, true);

        // Verify the correct methods were called
        verify(mockTextsToPrint).getTextForAllowedToVote();
        verify(mockTextsToPrint).getTextForAllowedToDrive();
    }

    @Test
    public void testWithAge19AndCitizenFalse() {
        TextsToPrint mockTextsToPrint = Mockito.mock(TextsToPrint.class);
        // Call the printOutput method with the mock
        OperatorLogic operatorLogic = new OperatorLogic(mockTextsToPrint);
        // getTextForAllowedToDoNothing should be called
        operatorLogic.printOutput(19, false);

        // Verify the correct methods were called
        verify(mockTextsToPrint).getTextForAllowedToDrive();
        verify(mockTextsToPrint).getTextForAllowedToDriveButNotVote();
    }

    @Test
    public void testWithAge15AndCitizenTrue() {
        TextsToPrint mockTextsToPrint = Mockito.mock(TextsToPrint.class);
        // Call the printOutput method with the mock
        OperatorLogic operatorLogic = new OperatorLogic(mockTextsToPrint);
        // getTextForAllowedToDoNothing should be called
        operatorLogic.printOutput(15, true);

        // Verify the correct methods were called
        verify(mockTextsToPrint).getTextForAllowedToDoNothing();
    }
}
