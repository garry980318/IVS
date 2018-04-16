package calculatorfx;

import static java.lang.Math.sqrt;

public class Math implements IMath {

    @Override
    public double Sum(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    @Override
    public double Sub(double minuend, double subtrahend) {
        double result = minuend - subtrahend;
        return result;
    }

    @Override
    public double Div(double divident, double divisor) {
        assert (divisor != 0);
        double result = divident / divisor;
        return result;
    }

    @Override
    public double Mult(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

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

    @Override
    public double Root(double num) {
        double result = sqrt(num);
        return result;
    }

    @Override
    public int toBinary(int basis) {
        String result = Integer.toString(basis, 2);
        int foo = Integer.parseInt(result);
        return foo;
    }

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
