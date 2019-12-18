package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Testet alle anderen Unittests.
 * @author patrick.von-fluee
 *
 */
@RunWith(Suite.class)
@SuiteClasses({ UnitTestNoDoor.class, UnitTestWalk.class })
public class AllTests {
	public AllTests() {
	}
}
