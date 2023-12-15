package KI301PaziukLab3;

import java.io.*;
public class App
{
    public static void main(String[] args) throws FileNotFoundException
    {
        MultipurposeDevice printer = new MultipurposeDevice();
        printer.printDocument("Sample Document 1");
        printer.addPaper(20);
        printer.replaceToner();
        printer.printDocument("Sample Document 2");
        printer.dispose();
        printer.scanDocument();
    }
}
