/**
 * This file contains an interface of a custom math library for addition, subtraction, multiplication, division, calculating factorials, power and root functions, conversion to binary and conversion to absolute values. It is a part of a group project for the subject IVS of Brno University of Technology. 
 *
 * @file Math.java
 * @author Michal Vasicek
 * @brief Interface for a custom math library.
 * @package calculatorfx
 * @see Math.java
 */
package calculatorfx;

public interface IMath {

    double Sum(double num1, double num2);

    double Sub(double minuend, double subtrahend);

    double Div(double divident, double divisor) throws Exception;

    double Mult(double num1, double num2);

    long Fact(long num) throws Exception;

    double Pow(double basis, double exponent) throws Exception;

    double Root(double n, double x) throws Exception;

    long toBinary(long basis);
    
    double Abs(double nonAbs);
}

/*** END OF FILE Math.java ***/
