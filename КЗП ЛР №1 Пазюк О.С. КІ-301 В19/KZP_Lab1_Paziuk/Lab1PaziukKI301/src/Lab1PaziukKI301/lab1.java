package Lab1PaziukKI301;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) throws Exception {
        int size;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        size = in.nextInt();
        in.nextLine();
        if(size % 2 == 0){
            throw new Exception("Введіть непарний розмір.");
        }
        int middle = (int) Math.ceil(size / 2);
        System.out.print("Введіть символ-заповнювач: ");
        filler = in.nextLine();
        if (filler.length() != 1){
            throw new Exception("Введіть символ-заповнювач довжиною 1");
        }
        for(int i = 0; i<size; i++){
            int count;
            if(i < middle ){
                count = (i + 1) *2-1;
            }else{
                count = (size - i - 1) * 2 + 1;
            }
            int start = (size - count) / 2;
            for(int j = 0; j<size; j++){
                if(i == middle || j == middle){
                    System.out.print(filler);
                    fout.print(filler);
                }else{
                    if(j < start || j > (start + count - 1)){
                        System.out.print(' ');
                        fout.print(' ');
                    }else{
                        System.out.print(filler);
                        fout.print(filler);
                    }
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }
        fout.flush();
        fout.close();
    }
}
