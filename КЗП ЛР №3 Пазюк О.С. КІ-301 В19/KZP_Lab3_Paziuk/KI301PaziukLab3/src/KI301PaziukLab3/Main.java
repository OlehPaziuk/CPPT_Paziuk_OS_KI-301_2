package KI301PaziukLab3;

import java.io.*;

public abstract class Main {
    public PaperTray paperTray;
    public TonerCartridge tonerCartridge;
    public PrintWriter fout;

    // Constructors
    public Main() throws FileNotFoundException {
        paperTray = new PaperTray();
        tonerCartridge = new TonerCartridge();
        fout = new PrintWriter("PrintLog.txt");
    }

    public Main(int paperCapacity, int tonerLevel) throws FileNotFoundException {
        paperTray = new PaperTray(paperCapacity);
        tonerCartridge = new TonerCartridge(tonerLevel);
        fout = new PrintWriter("PrintLog.txt");
    }

    // Methods
    public abstract void printDocument(String document);
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