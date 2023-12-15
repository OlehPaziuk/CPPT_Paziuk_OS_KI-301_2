package KI301PaziukLab5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation implements CalculationInterface {
    @Override
    public double doCalculation(double variable) {
        try {
            return Math.cos(variable) / Math.sin(variable) / (Math.sin(2 * variable) + 4 * Math.cos(variable));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception: illegal value.");
        }
        return 0;
    }
}
