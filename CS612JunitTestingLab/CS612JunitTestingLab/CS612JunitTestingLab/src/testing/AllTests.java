package testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ countATest.class, divideNegativeTest.class, dividePositiveTest.class, squareTest.class })
public class AllTests {

}
