import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.theceshop.Project4HexagonalNumber;

public class Project4HexagonalNumberTest {

    @Test
    public void testHexagonalNumberForN_positiveNumber() {
        int n = 5;
        int expectedHexagonalNumber = 45;
        String[] args = {String.valueOf(n)};

        Project4HexagonalNumber.main(args);

        Assertions.assertEquals(expectedHexagonalNumber, hexagonalNumberFor(n));
    }

    @Test
    public void testHexagonalNumberForN_negativeNumber() {
        int n = -5;
        int expectedHexagonalNumber = 55;
        String[] args = {String.valueOf(n)};

        Project4HexagonalNumber.main(args);

        Assertions.assertEquals(expectedHexagonalNumber, hexagonalNumberFor(n));
    }

    @Test
    public void testHexagonalNumberForN_zero() {
        int n = 0;
        int expectedHexagonalNumber = 0;
        String[] args = {String.valueOf(n)};

        Project4HexagonalNumber.main(args);

        Assertions.assertEquals(expectedHexagonalNumber, hexagonalNumberFor(n));
    }


    private int hexagonalNumberFor(int n) {
        return n * (2 * n - 1);
    }
}