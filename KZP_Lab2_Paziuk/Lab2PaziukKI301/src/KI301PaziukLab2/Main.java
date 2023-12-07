package KI301PaziukLab2;

import java.io.*;
import java.io.File;

public class Main {
    private PaperTray paperTray;
    private TonerCartridge tonerCartridge;
    private PrintWriter fout;

    // Constructors
    public Main() throws FileNotFoundException {
        paperTray = new PaperTray();
        tonerCartridge = new TonerCartridge();
        fout = new PrintWriter(new File("PrintLog.txt"));
    }

    public Main(int paperCapacity, int tonerLevel) throws FileNotFoundException {
        paperTray = new PaperTray(paperCapacity);
        tonerCartridge = new TonerCartridge(tonerLevel);
        fout = new PrintWriter(new File("PrintLog.txt"));
    }

    // Methods
    public void printDocument(String document) {
        if (paperTray.hasPaper() && tonerCartridge.hasToner()) {
            System.out.println("Printing document: " + document);
            paperTray.usePaper();
            tonerCartridge.useToner();
        } else {
            System.out.println("Unable to print. Check paper or toner.");
        }
    }

    public void addPaper(int sheets) {
        paperTray.addPaper(sheets);
        System.out.println("Added " + sheets + " sheets of paper. New paper level: " + paperTray.getPaperLevel());
    }

    public void replaceToner() {
        tonerCartridge.replaceToner();
        System.out.println("Toner replaced. New toner level: " + tonerCartridge.getTonerLevel());
    }

    // ... (other methods)

    public void dispose() {
        // Cleanup code, if needed
    }
}

class PaperTray {
    private int paperLevel;

    public PaperTray() {
        paperLevel = 100;
    }

    public PaperTray(int capacity) {
        paperLevel = capacity;
    }

    public boolean hasPaper() {
        return paperLevel > 0;
    }

    public void usePaper() {
        if (hasPaper()) {
            paperLevel--;
        }
    }

    public void addPaper(int sheets) {
        paperLevel += sheets;
    }

    public int getPaperLevel() {
        return paperLevel;
    }
}

class TonerCartridge {
    private int tonerLevel;

    public TonerCartridge() {
        tonerLevel = 100;
    }

    public TonerCartridge(int level) {
        tonerLevel = level;
    }

    public boolean hasToner() {
        return tonerLevel > 0;
    }

    public void useToner() {
        if (hasToner()) {
            tonerLevel--;
        }
    }

    public void replaceToner() {
        tonerLevel = 100;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}