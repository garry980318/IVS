/**
 * This file contains tests for the custom math library used for the calculator. Each method is tested by using it to calculate a result and then comparing the results with standart operations. It is a part of a group project for the subject IVS of Brno University of Technology. 
 *
 * @file MathTest.java
 * @author Michal Vasicek
 * @brief Test the functionality of the custom math library.
 * @see Math.java, IMath.java
 * @package test
 */
package test;

import calculatorfx.Math;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import static org.junit.Assume.assumeNoException;

/**
 * @class MathTest
 * @brief Class containing the tests.
 * @post Custom math library is tested whether it works as desired or not.
 */
public class MathTest {

    Random rand = new Random();

    public MathTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Testing Sum method by comparing its results to results of the standart operation "+" using random input numbers.
     *
     * @brief Test of Sum method.
     * @post Method Sum produced the same results as operation "+" (or not)
     */
    @Test
    public void testSum() {
        System.out.println("Sum");
        Math instance = new Math();

        for (int i = 0; i != 50; i++) {
            for (int a = -10; a != 10; a++) {
                double num1 = a;
                double num2 = i;
                double expResult = num1 + num2;
                double result = instance.Sum(num1, num2);
                assertEquals(expResult, result, 0);
            }
        }
        for (int i = 0; i != 10; i++) {
            double n = rand.nextInt((20) * (1));
            double m = rand.nextInt(50) + 1;
            double v = n + m;
            double result2 = instance.Sum(n, m);
            assertEquals(v, result2, 0);
        }
    }

    /**
     * Testing Sub method by comparing its results to results of the standart operation "-" using random input numbers.
     *
     * @brief Test of Sub method.
     * @post Method Sub produced the same results as operation "-" (or not)
     */
    @Test
    public void testSub() {
        System.out.println("Sub");
        Math instance = new Math();

        for (int i = 0; i != 50; i++) {
            for (int a = -10; a != 10; a++) {
                double minuend = a;
                double subtrahend = i;
                double expResult = minuend - subtrahend;
                double result = instance.Sub(minuend, subtrahend);
                assertEquals(expResult, result, 0);
            }
        }
        
        for (int i = 0; i == 10; i++) {
            double n = rand.nextInt((20) * (1));
            double m = rand.nextInt(50) - 1;
            double v = n + m;
            double result2 = instance.Sub(n, m);
            assertEquals(v, result2, 0);
        }
    }

    /**
     * Testing Div method by comparing its results to results of the standart operation "/" using random input numbers.
     *
     * @brief Test of Div method.
     * @post Method div produced the same results as operation "/" (or not)
     * @throws java.lang.Exception
     */
    @Test
    public void testDiv() throws Exception {
        System.out.println("Div");
        Math instance = new Math();
        for (int i = 1; i != 50; i++) {
            for (int a = -5; a != 10; a++) {
                if (i == 0) {
                    a++;
                }
                double divident = a;
                double divisor = i;
                double expResult = divident / divisor;
                double result = instance.Div(divident, divisor);
                assertEquals(expResult, result, 0);
            }
        }

        try {
            for (int i = 0; i != 10; i++) {
                double n = rand.nextInt((20) + (1));
                double m = rand.nextInt(50) + 1;
                double v = n / m;
                double result2 = instance.Div(n, m);
                assertEquals(v, result2, 0);
            }
            instance.Div(5, 0);
        } catch (Exception e) {

            assumeNoException(e);
        }
    }

    /**
     * Testing Mult method by comparing its results to results of the standart operation "*" using random input numbers.
     *
     * @brief Test of Mult method.
     * @post Method Mult produced the same results as operation "*" (or not)
     */
    @Test
    public void testMult() {
        System.out.println("Mult");
        Math instance = new Math();

        for (int i = 1; i != 50; i++) {
            for (int a = -10; a != 10; a++) {
                double num1 = a;
                double num2 = i;
                double expResult = num1 * num2;
                double result = instance.Mult(num1, num2);
                assertEquals(expResult, result, 0);
            }
        }

        for (int i = 0; i != 10; i++) {
            double n = rand.nextInt((20) + (1));
            double m = rand.nextInt(50) - 1;
            double v = n * m;
            double result2 = instance.Mult(n, m);
            assertEquals(v, result2, 0);
        }
    }

    /**
     * Testing Fact method by comparing its results to expected results.
     *
     * @brief Test of Fact method.
     * @post Method Fact produced the expected results (or not)
     * @throws java.lang.Exception
     */
    @Test
    public void testFact() throws Exception {
        System.out.println("Fact");
        Math instance = new Math();
        long num3 = 3L;
        long num4 = 4L;
        long num5 = 5L;
        long num6 = -2L;
        long expResult3 = 6L;
        long expResult4 = 24L;
        long expResult5 = 120L;
        long result3 = instance.Fact(num3);
        assertEquals(expResult3, result3, 0);
        long result4 = instance.Fact(num4);
        assertEquals(expResult4, result4, 0);
        long result5 = instance.Fact(num5);
        assertEquals(expResult5, result5, 0);

        try {
            instance.Fact(num6);
        } catch (Exception e) {
            assumeNoException(e);
        }
    }

    /**
     * Testing Pow method by comparing its results to results of the standart method "pow" using random input numbers.
     *
     * @brief Test of Pow method.
     * @post Method Pow produced the same results as method "pow" (or not)
     * @throws java.lang.Exception
     */
    @Test
    public void testPow() throws Exception {
        System.out.println("Pow");
        Math instance = new Math();

        for (int i = 3; i != 20; i++) {
            for (int a = 0; a != 5; a++) {
                double basis = i;
                double exponent = a;
                double expResult = pow(i, a);
                double result = instance.Pow(basis, exponent);
                assertEquals(expResult, result, 0);
            }
        }
        try {
            instance.Pow(-2, -2);
        } catch (Exception e) {
            assumeNoException(e);
        }
    }

    /**
     * Testing Root method by comparing its results to results of the standart method "sqrt" using random input numbers.
     *
     * @brief Test of Root method.
     * @post Method Root produced the same results as method "sqrt" (or not)
     * @throws java.lang.Exception
     */
    @Test
    public void testRoot() throws Exception {
        System.out.println("Root");
        Math instance = new Math();

        for (int i = 81; i != 82; i++) {
            for (int a = 3; a != 5; a++) {

                double basis = i;
                double exponent = a + 1;
                double result = instance.Root(exponent, basis);
                double expResult = basis;
                while (exponent != 2) {
                    expResult = sqrt(expResult);
                    exponent--;
                }
                assertEquals(round(expResult), round(result), 0);
            }
        }

        try {
            instance.Root(0, 2);
        } catch (Exception e) {
            assumeNoException(e);
        }
        try {
            instance.Root(2, 0);
        } catch (Exception e) {
            assumeNoException(e);
        }
    }

    /**
     * Testing ToBinary method by comparing its results to results of the standart methods "toString" and "parseInt" using random input numbers.
     *
     * @brief Test of ToBinary method.
     * @post Method ToBinary produced the same results as methods "toString" and "parseInt" (or not)
     */
    @Test
    public void testToBinary() {
        System.out.println("toBinary");
        Math instance = new Math();
        for (int i = 0; i != 20; i++) {
            long basis = i;
            String expResult = Long.toString(basis, 2);
            long foo = Long.parseLong(expResult);
            long result = instance.toBinary(basis);
            assertEquals(foo, result, 0);
        }

        for (int i = 0; i != 10; i++) {
            long basis = rand.nextInt(200);
            String expResult = Long.toString(basis, 2);
            long foo = Long.parseLong(expResult);
            long result = instance.toBinary(basis);
            assertEquals(foo, result, 0);
        }
    }

    /**
     * Testing Abs method by comparing its results to results of the standart
     * method "abs"using random negative input numbers.
     *
     * @brief Test of Abs method.
     * @post Method Abs produced the same results as method "abs" (or not)
     */
    @Test
    public void testAbs() {
        System.out.println("Abs");
        Math instance = new Math();

        for (int i = 0; i != 20; i++) {
            double nonAbs = i;
            double expResult = abs(nonAbs);
            double result = instance.Abs(nonAbs);
            assertEquals(expResult, result, 0);
        }

        for (int i = 0; i != 10; i++) {
            int nonAbs = rand.nextInt((200)) * (-1);
            double v = abs(nonAbs);
            double result = instance.Abs(nonAbs);
            assertEquals(v, result, 0);
        }
    }
}

/*** END OF FILE MathTest.java ***/
