package Lab1PaziukKI301;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        int nRows;
        boolean half = false;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        if(nRows % 2 == 0) {
            throw new Exception("Введіть непарний розмір.");
        }

        arr = new char[nRows][];
        String sp = "";
        for (int i = 0; i < nRows/2; i++){
            sp += "  ";
        }
        int x = -1;
        int y = 0;
        while(y < nRows / 2){
            arr[y] = new char[x+2];
            x+=2;
            y+=1;
        }
        while(x > 2 & y < nRows){
            arr[y] = new char[x-2];
            x-=2;
            y+=1;
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();

        exit:
        for(int i = 0; i<nRows-2; i++)
        {
            if (i==(nRows-2)/2){half = true;}
            System.out.print(sp);
            if (half == false){sp= sp.substring(0, sp.length() - 2);}
            else{sp += "  ";}
            for(int j = 0; j < arr[i].length; j++)
            {
                if(filler.length() == 1)
                {
                    arr[i][j] = (char) filler.codePointAt(0);
                    System.out.print(arr[i][j] + " ");
                    fout.print(arr[i][j] + " ");
                }
                else if (filler.length() == 0)
                {
                    System.out.print("\nНе введено символ-заповнювач");
                    break exit;
                }
                else
                {
                    System.out.print("\nЗабагато символів-заповнювачів");
                    break exit;
                }
            }
            System.out.print("\n");
            fout.print("\n");
        }

        fout.flush();
        fout.close();

    }
}
