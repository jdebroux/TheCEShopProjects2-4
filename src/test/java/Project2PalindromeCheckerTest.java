import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.theceshop.Project2PalindromeChecker;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Project2PalindromeCheckerTest {

    @Autowired
    Project2PalindromeChecker project2PalindromeChecker;

    @Test
    public void testIsPalindrome_standardCaseInsensitive() {
        String input = "Racecar";

        Boolean result = project2PalindromeChecker.checkStringForPalindrome(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPalindrome_numbers() {
        String input = "1234321";

        Boolean result = project2PalindromeChecker.checkStringForPalindrome(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPalindrome_specialCharacters() {
        String input = "$**$";

        Boolean result = project2PalindromeChecker.checkStringForPalindrome(input);
        Assertions.assertTrue(result);
    }

    @Test
    public void testIsPalindrome_caseSensitive() {
        String input = "Racecar";

        Boolean result = project2PalindromeChecker.checkStringForPalindrome(input, Boolean.TRUE);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNotPalindrome_standard() {
        String input = "false";

        Boolean result = project2PalindromeChecker.checkStringForPalindrome(input);
        Assertions.assertFalse(result);
    }

    @Test
    public void testIsNotPalindrome_whiteSpace() {
        String input = "Race car";

        Boolean result = project2PalindromeChecker.checkStringForPalindrome(input);
        Assertions.assertFalse(result);
    }
}
