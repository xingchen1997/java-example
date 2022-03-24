package org.piki;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        assertTrue(true);
    }

    public void testFibonacci() {
        assertEquals(1, App.fibonacci(1));
        assertEquals(1, App.fibonacci(2));
        assertEquals(55, App.fibonacci(10));
        assertEquals(6765, App.fibonacci(20));
        assertEquals(832040, App.fibonacci(30));
        assertEquals(102334155, App.fibonacci(40));
        assertEquals(2971215073L, App.fibonacci(47));
    }
}
