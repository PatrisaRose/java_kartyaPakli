package gondolatolvaso;

import java.util.Scanner;

public class Gondolatolvaso {

    static String[] kartyak = new String[21];
    static String[] szinek = {"P", "T", "Z", "M"};
    static String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Feltolt();
        for (int i = 0; i < 3; i++) {
            Kirak();
            Melyik();
            Kever();
        }
        EzVolt();
    }

    private static void Feltolt() {
        int db = 0;
        for (String szinek1 : szinek) {
            for (int j = 0; db < kartyak.length && j < ertekek.length; j++) {
                kartyak[db++] = szinek1 + "_" + ertekek[j];
            }
        }
    }

    private static void Kirak() {
        for (int i = 0; i < kartyak.length; i++) {
            System.out.printf("%-7s", kartyak[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }

    }

    private static void Melyik() {
        boolean jo;
        do {
            System.out.print("Melyik oszlop: 1-3):");
            int oszlop = Integer.parseInt(sc.nextLine());
            jo = oszlop >= 1 && oszlop <= 3;
        }while(!jo);
        

    }

    private static void Kever() {

    }

    private static void EzVolt() {
        System.out.println("A gondolt lap: " + kartyak[11]);
    }
}
