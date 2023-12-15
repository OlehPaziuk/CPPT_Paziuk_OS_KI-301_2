package KI301PaziukLab3;

import java.io.FileNotFoundException;

public class MultipurposeDevice extends Main implements DeviceInterface
{
    public MultipurposeDevice() throws FileNotFoundException {
    }
    public void printDocument(String document) {
        if (paperTray.hasPaper() && tonerCartridge.hasToner()) {
            System.out.println("Printing document: " + document);
            paperTray.usePaper();
            tonerCartridge.useToner();
        } else {
            System.out.println("Unable to print. Check paper or toner.");
        }
}
    public void scanDocument() {
        // Scans and backs up a document
        System.out.println("File successfully scanned.");
    }
}
