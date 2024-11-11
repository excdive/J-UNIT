package Activity3_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordCheckerTest {

    @Test
    public void testCombineString_WithLongName() {
        PasswordChecker passwordChecker = new PasswordChecker();
        String result = passwordChecker.combineString("Samuel");
        assertTrue(result.startsWith("Sam") && result.length() == 6); // Expecting "Sam" + 3 random chars
    }

    @Test
    public void testCombineString_WithShortName() {
        PasswordChecker passwordChecker = new PasswordChecker();
        String result = passwordChecker.combineString("Sam");
        assertTrue(result.startsWith("Sam") && result.length() == 6); // Expecting "Sam" + 3 random chars
    }

    @Test
    public void testCombineString_WithNameLessThanThreeChars() {
        PasswordChecker passwordChecker = new PasswordChecker();
        String result = passwordChecker.combineString("Jo");
        assertTrue(result.startsWith("Jo") && result.length() == 5); // Expecting "Jo" + 3 random chars
    }

    @Test
    public void testCombineString_WithEmptyName() {
        PasswordChecker passwordChecker = new PasswordChecker();
        String result = passwordChecker.combineString("");
        assertTrue(result.length() == 3); // Expecting only 3 random chars
    }

    @Test
    public void testCombineString_WithEmptyRandChars() {
        PasswordChecker passwordChecker = new PasswordChecker();
        String result = passwordChecker.combineString("Samuel");
        assertTrue(result.startsWith("Sam") && result.length() == 6); // Expecting "Sam" + 3 random chars
    }
}
