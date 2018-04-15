package calculatorfx;

public interface IMath {

    double Sum(double num1, double num2);

    double Sub(double minuend, double subtrahend);

    double Div(double divident, double divisor);

    double Mult(double num1, double num2);

    long Fact(long num);

    double Pow(double basis, double exponent);

    double Root(double num);

    double Abs(double nonAbs);

    int toBinary(int basis);
}
