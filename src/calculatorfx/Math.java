/**
 * This file contains a java implementation of a custom math library for addition, subtraction, multiplication, division, calculating factorials, power and root functions, conversion to binary and conversion to absolute values. It is a part of a group project for the subject IVS of Brno University of Technology.
 *
 * @file Math.java
 * @author Michal Vasicek
 * @brief Implementation of a custom math library.
 * @package calculatorfx
 */
package calculatorfx;

/**
 * @class Math
 * @brief Class containing the methods of the math library.
 * @see MathTest.java where the functionality is tested.
 */
public class Math implements IMath {

    /**
     * Method Sum produces a sum of two numbers
     *
     * @brief Method Sum
     * @param num1 is the first number to be added
     * @param num2 is the second number to be added
     * @return sum of num1 and num2
     */
    @Override
    public double Sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    /**
     * Method Sub produces a difference of two numbers
     *
     * @brief Method Sub
     * @param minuend is the number to be subtracted from
     * @param subtrahend is the number to be subtracted
     * @return difference between minuend and subtrahend
     */
    @Override
    public double Sub(double minuend, double subtrahend) {
        double result = minuend - subtrahend;
        return result;
    }

    /**
     * Method Div produces a division of two numbers
     *
     * @brief Method Div
     * @param divident is the number to be divised
     * @param divisor is the number to be divised by
     * @warning exception thrown when divisor is 0
     * @return division of divident and divisor
     * @throws Exception (Division by zero.)
     */
    @Override
    public double Div(double divident, double divisor) throws Exception {
        if (divisor == 0) {
            throw new Exception("Division by zero.");
        }
        double result = divident / divisor;
        return result;
    }

    /**
     * Method Mult produces a multiplication of two numbers
     *
     * @brief Method Mult
     * @param num1 is the first number to be multiplied
     * @param num2 is the second number to be multiplied
     * @return product of num1 and num2
     */
    @Override
    public double Mult(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    /**
     * Method Fact produces a factorial of a number
     *
     * @brief Method Fact
     * @param num is the number to be factorised
     * @return factorial of num
     * @throws Exception (Factorial of negative number.)
     */
    @Override
    public long Fact(long num) throws Exception {
        long x = num;
        long result = 1;
        if (num < 0) {
            throw new Exception("Factorial of negative number.");
        }
        for (; x != 0; x--) {
            result *= x;
        }
        return result;
    }

    /**
     * Method Pow produces an exponentiation of a number
     *
     * @brief Method Pow
     * @param basis is the basis
     * @param exponent is the exponent
     * @return basis to the power of the exponent
     * @throws Exception (Negative exponent.)
     */
    @Override
    public double Pow(double basis, double exponent) throws Exception {

        if (exponent < 0) {
            throw new Exception("Negative exponent.");
        }
        if (exponent == 0) {
            return 1;
        } else {
            double x = basis;
            for (int i = 1; i != exponent; i++) {
                basis *= x;
            }
        }
        return basis;
    }

    /**
     * Method Root produces a square root of a number
     *
     * @brief Method Root
     * @param n is the grade of root
     * @param x is the basis
     * @return square root of num
     * @throws Exception (Root not defined.) || (Even root from negative number.)
     */
    @Override
    public double Root(double n, double x) throws Exception {
        double result = 1;
        double pResult = 2;
        if (n < 1) {
            throw new Exception("Root not defined.");
        }
        if (n == 1) {
            return x;
        }
        if (x < 0 && n % 2 == 0) {
            throw new Exception("Even root from negative number.");
        }
        if (x == 0) {
            return 0;
        }

        while (Abs(pResult - result) >= 0.0001) {
            pResult = result;
            result = (1 / n) * ((n - 1) * result + (x / Pow(result, n - 1)));
        }
        return result;
    }

    /**
     * Method toBinary converts a number to binary
     *
     * @brief Method toBinary
     * @param basis is the number to be converted
     * @return basis written in binary
     */
    @Override
    public long toBinary(long basis) {
        String result = Long.toString(basis, 2);
        long foo = Long.parseLong(result);
        return foo;
    }

    /**
     * Method Abs converts a number to its absolute value
     *
     * @brief Method Abs
     * @param nonAbs is the number to be converted
     * @return absolute value of nonAbs
     */
    @Override
    public double Abs(double nonAbs) {
        if (nonAbs < 0) {
            return nonAbs * (-1);
        } else {
            return nonAbs;
        }
    }
}

/*** END OF FILE Math.java ***/
