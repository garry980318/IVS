package calculatorfx;

public interface IMath {

    double Sum(double num1, double num2);

    double Sub(double minuend, double subtrahend);

    double Div(double divident, double divisor) throws Exception;

    double Mult(double num1, double num2);

    long Fact(long num) throws Exception;

    double Pow(double basis, double exponent) throws Exception;

    double Root(double n, double x) throws Exception;

    double Abs(double nonAbs);

    long toBinary(long basis);
}
