import org.junit.jupiter.api.Test;
import org.theceshop.Project3AddTo10;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Project3AddTo10Test {

    @Test
    public void testPrintCombinationsThatEqual10_success() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Project3AddTo10.printCombinationsThatEqual10(nums);
        String expectedOutput = "1 + 9 = 10\n" +
                "2 + 8 = 10\n" +
                "3 + 7 = 10\n" +
                "4 + 6 = 10\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testPrintCombinationsThatEqual10_emptyArrayInput() {
        int[] nums = {};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Project3AddTo10.printCombinationsThatEqual10(nums);
        String expectedOutput = "Please enter at least 2 numbers\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testPrintCombinationsThatEqual10_noNumbersEqual10() {
        int[] nums = {1, 2, 3, 4};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Project3AddTo10.printCombinationsThatEqual10(nums);
        String expectedOutput = "";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testPrintCombinationsThatEqual10_onlyOneNumberInputed() {
        int[] nums = {1};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Project3AddTo10.printCombinationsThatEqual10(nums);
        String expectedOutput = "Please enter at least 2 numbers\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}