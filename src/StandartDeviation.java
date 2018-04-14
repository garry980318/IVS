import java.util.Scanner;

public class StandartDeviation{

    public static void main(String[] args) {

        IMath mathLib = new Math();
    
        Scanner inputLine = new Scanner(System.in);
        String line = inputLine.nextLine();
        Scanner input = new Scanner(line);
    
        double number = 0;
        double sumOfNumbers = 0;
        double sumOfSquaredNumbers = 0;
        double countOfNumbers = 0;


        while(input.hasNextDouble()){
            number = input.nextDouble();
            sumOfNumbers = mathLib.Sum(sumOfNumbers, number);
            sumOfSquaredNumbers = mathLib.Sum(sumOfSquaredNumbers, mathLib.Pow(number, 2));
            countOfNumbers++; //countOfNumbers = mathlib.Sum(countOfNumbers, 1) ???
        }

        double mean = mathLib.Div(sumOfNumbers, countOfNumbers);
        double result = mathLib.Root(mathLib.Div(mathLib.Sub(sumOfSquaredNumbers, mathLib.Mult(countOfNumbers, mathLib.Pow(mean, 2))),mathLib.Sub(countOfNumbers,1)));

        System.out.println("standart dev is " + result);

    }

}
