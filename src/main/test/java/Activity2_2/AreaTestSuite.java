package Activity2_2;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Specify this class as a JUnit Suite
@RunWith(Suite.class)
// Include all test classes here
@Suite.SuiteClasses({
        TestArea.class,      // Test class for area calculations
        Rectangle.class, // Test class specifically for Rectangle tests
        Circle.class,    // Test class specifically for Circle tests
        Square.class,     // Test class specifically for Square tests
        Parallelogram.class,
        Triangle.class
        // Add any other test classes related to Area calculations here
})
  public class AreaTestSuite {
    // This class remains empty. It is used only as a holder for the above annotations.
}
