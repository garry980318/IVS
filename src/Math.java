/**
 * This file contains a java implementation of a custom math library for addition, subtraction, multiplication, division, calculating factorials, power and root functions, conversion to binary and conversion to absolute values. It is a part of a group project for the subject IVS of Brno University of Technology. 
 *
 * @file Math.java
 * @author Michal Vasicek
 * @brief Implementation of a custom math library.
 * @package calculatorfx
 */

package calculatorfx;

import static java.lang.Math.sqrt;

/**
 * @class Class containing the methods of the math library.
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
     */
    
    @Override
    public double Div(double divident, double divisor) {
        assert (divisor != 0);
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
     * @param num is the  number to be factorised
     * @return factorial of num
     */
    
    @Override
    public long Fact(long num) {
        long x = num;
        long result = 1;
        assert (num < 0);
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
     */

    @Override
    public double Pow(double basis, double exponent) {

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
     * @param num is the basis
     * @return square root of num
     */

    @Override
    public double Root(double num) {
        double result = sqrt(num);
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
    public int toBinary(int basis) {
        String result = Integer.toString(basis, 2);
        int foo = Integer.parseInt(result);
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
            nonAbs = nonAbs * (-1);
            return nonAbs;
        } else {
            return nonAbs;
        }
    }
}

/*** END OF FILE Math.java ***/
