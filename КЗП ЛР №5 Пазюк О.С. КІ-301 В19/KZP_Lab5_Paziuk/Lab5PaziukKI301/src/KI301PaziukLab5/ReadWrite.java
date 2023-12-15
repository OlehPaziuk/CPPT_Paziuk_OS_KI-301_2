    package KI301PaziukLab5;

    import java.io.*;
    import java.util.Scanner;

    public class ReadWrite {
        public void WriteIntoFile(double variable) throws FileNotFoundException {
            File dataFile = new File("Output.txt");
            PrintWriter fout = new PrintWriter(dataFile);
            fout.print(variable);
            fout.flush();
            fout.close();
        }
        public void ReadFromFile() throws FileNotFoundException {
            Scanner sc = new Scanner(new File("Output.txt"));
            while(sc.hasNext()){
                String next = sc.next();
                System.out.println(next);
            }
            sc.close();
        }
        public void WriteIntoBin(double variable) throws IOException {
            DataOutputStream out = new DataOutputStream(new FileOutputStream("OutputBin.dat"));
            out.writeDouble(variable);
        }
        public void ReadFromBin() throws IOException {
            DataInputStream in = new DataInputStream(new FileInputStream("OutputBin.dat"));
            double n = in.readDouble();
            System.out.println(n);
        }
    }