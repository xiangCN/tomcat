package org.apache.juli.logging;

import org.junit.*;

import static org.junit.Assert.*;

public class DirectJDKLogTest {
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("BeforeClass()");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("AfterClass()");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("    Before()");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("    After()");
    }

    public DirectJDKLogTest() {
        System.out.println("  new DirectJDKLogTest()");
    }

//    @Test
    public void testA() {
        System.out.println("    testA()");
    }

    @Test
    public void testB() {
        Log debug = DirectJDKLog.getInstance("DEBUG");
        debug.error("哈哈哈");
        System.out.println("ssfasdf");
    }

//    @Test(expected=Exception.class)
    public void testC() throws Exception {
        throw new Exception();
    }

}