package KI301PaziukLab5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        CalculationInterface calc = new Calculation();
        ReadWrite read = new ReadWrite();
        read.WriteIntoFile(calc.doCalculation(55));
        read.ReadFromFile();
        read.WriteIntoBin(calc.doCalculation(67));
        read.ReadFromBin();
    }

}
