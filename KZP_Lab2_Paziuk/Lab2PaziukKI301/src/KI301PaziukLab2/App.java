package KI301PaziukLab2;

import java.io.*;
public class App
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Main printer = new Main();
        printer.printDocument("Sample Document 1");
        printer.addPaper(20);
        printer.replaceToner();
        printer.printDocument("Sample Document 2");
        printer.dispose();
    }
}
