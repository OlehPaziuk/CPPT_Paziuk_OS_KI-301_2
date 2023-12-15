package KI301PaziukLab4;

public class App {
    public static void main(String[] args) {
        CalculationInterface calc = new Calculation();
        System.out.println("  y=ctg(x)/(sin(2x) + 4cos(x)) = " + calc.doCalculation(144));
        System.out.println("  y=ctg(x)/(sin(2x) + 4cos(x)) = " + calc.doCalculation(76));
        System.out.println("  y=ctg(x)/(sin(2x) + 4cos(x)) = " + calc.doCalculation(-4444));

        System.out.println("  y=ctg(x)/(sin(2x) + 4cos(x)) = " + calc.doCalculationWithInputInside());
    }
}
