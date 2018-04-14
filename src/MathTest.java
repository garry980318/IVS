package test;

import model.Math;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

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
     * Test of Sum method, of class Math.
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
     * Test of Sub method, of class Math.
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
     * Test of Div method, of class Math.
     */
    @Test
    public void testDiv() {
        System.out.println("Div");
        Math instance = new Math();
        for (int i = 1; i != 50; i++) {
            for (int a = 0; a != 10; a++) {
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

        for (int i = 0; i != 10; i++) {
            double n = rand.nextInt((20) + (1));
            double m = rand.nextInt(50) + 1;
            double v = n / m;
            double result2 = instance.Div(n, m);
            assertEquals(v, result2, 0);
        }

    }

    /**
     * Test of Mult method, of class Math.
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
     * Test of Fact method, of class Math.
     */
    @Test
    public void testFact() {
        System.out.println("Fact");
        Math instance = new Math();
        long num = 1L;
        long num2 = 2L;
        long num3 = 3L;
        long num4 = 4L;
        long num5 = 5L;

        long expResult = 1L;
        long expResult2 = 2L;
        long expResult3 = 6L;
        long expResult4 = 24L;
        long expResult5 = 120L;

        long result = instance.Fact(num);
        assertEquals(expResult, result, 0);
        long result2 = instance.Fact(num2);
        assertEquals(expResult2, result2, 0);
        long result3 = instance.Fact(num3);
        assertEquals(expResult3, result3, 0);
        long result4 = instance.Fact(num4);
        assertEquals(expResult4, result4, 0);
        long result5 = instance.Fact(num5);
        assertEquals(expResult5, result5, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Pow method, of class Math.
     */
    @Test
    public void testPow() {
        System.out.println("Pow");
        Math instance = new Math();
        for (int i = 3; i != 20; i++) {
            for (int a = 1; a != 5; a++) {
                double basis = i;
                double exponent = a;
                double expResult = pow(i, a);
                double result = instance.Pow(basis, exponent);
                assertEquals(expResult, result, 0);
            }
        }
    }

    /**
     * Test of Root method, of class Math.
     */
    @Test
    public void testRoot() {
        System.out.println("Root");
        Math instance = new Math();
        for (int i = 0; i != 20; i++) {
            double num = i;
            double expResult = sqrt(num);
            double result = instance.Root(num);
            assertEquals(expResult, result, 0);
        }

        for (int i = 0; i != 10; i++) {
            int num = rand.nextInt((200));
            double v = sqrt(num);
            double result = instance.Root(num);
            assertEquals(v, result, 0);
        }
    }

    /**
     * Test of toBinary method, of class Math.
     */
    @Test
    public void testToBinary() {
        System.out.println("toBinary");
        Math instance = new Math();
        for (int i = 0; i != 20; i++) {
            int basis = i;
            String expResult = Integer.toString(basis, 2);
            int foo = Integer.parseInt(expResult);
            int result = instance.toBinary(basis);
            assertEquals(foo, result, 0);
        }

        for (int i = 0; i != 10; i++) {
            int basis = rand.nextInt(200);
            String expResult = Integer.toString(basis, 2);
            int foo = Integer.parseInt(expResult);
            int result = instance.toBinary(basis);
            assertEquals(foo, result, 0);
        }

    }

    /**
     * Test of Abs method, of class Math.
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
