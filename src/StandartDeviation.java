/**
 * This file contains a java implementation of a program to calculate the standart deviation (SD) using custom math library. It is a part of a group project for the subject IVS of Brno University of Technology.
 *
 * @file StandartDeviation.java
 * @author Ondrej Holub
 * @brief Program to calculate the SD.
 * @see Math.java, IMath.java
 * @package calculatorfx
 */
package calculatorfx;

import java.util.Scanner;

/**
 * @class StandartDeviation
 * @brief Implementation of the SD, includes main.
 * @pre The data, out of which the SD is to be calculated, need to be available on the standart input after the program is executed.
 * @post SD is printed to the standart output.
 */
public class StandartDeviation {

    public static void main(String[] args) throws Exception {

        IMath mathLib = new Math(); /**< Import of the math library */

        Scanner inputLine = new Scanner(System.in);
        String line = inputLine.nextLine(); /**< Read one line from the standart output */
        Scanner input = new Scanner(line);

        double number; /**< Number currently read from the standart output */
        double sumOfNumbers = 0; /**< Sum of all inputted numbers (a+b+...)*/
        double sumOfSquaredNumbers = 0; /**< Sum of all inputted numbers squared (a^2+b^2+...) */
        double countOfNumbers = 0; /**< The number of numbers (N)*/

        while(input.hasNextDouble()){
            number = input.nextDouble();
            sumOfNumbers = mathLib.Sum(sumOfNumbers, number);
            sumOfSquaredNumbers = mathLib.Sum(sumOfSquaredNumbers, mathLib.Pow(number, 2));
            countOfNumbers = mathLib.Sum(countOfNumbers, 1); //==countOfNumbers++ (but using the custom math library)
        }

        double mean = mathLib.Div(sumOfNumbers, countOfNumbers); /**< Mean of all inputted numbers */
        double result = mathLib.Root(2, mathLib.Div(mathLib.Sub(sumOfSquaredNumbers, mathLib.Mult(countOfNumbers, mathLib.Pow(mean, 2))),mathLib.Sub(countOfNumbers,1))); /**< Implementation of the equation of the SD */

        System.out.println("standart dev is " + result);
    }
}

/*** END OF FILE StandartDeviation.java ***/
