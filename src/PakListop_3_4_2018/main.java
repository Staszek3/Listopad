package PakListop_3_4_2018;


import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

public class main {


    public static void main(String[] args) {
        System.out.println("podaje środkowy index dla parzystych i nieparzystych długości tablic");
        int a = saerchIndeks(new int[]{1, 9, 6, 9, 6, 8});
        System.out.println(a);
        System.out.println("Wypisuje wartosci od poczatku do podanego Indexu");
        writeTab_Indeks(new int[]{1, 9, 6, 9, 6, 8}, 2);
        System.out.println("Wyisuje wartosci od podanego Indeksu do końca tablicy");
        writeFromTab_Indeks(new int[]{1, 9, 6, 9, 6, 8}, 5);
        //
        Integer[] array = new Integer[]{9, 13, 5, 2, 9, 7, 4};

        SearchAlgorithm searchAlgorithm = new LinearSearch();

        int result = searchAlgorithm.search(17, array);

        System.out.println(result);
    }

    public static int saerchIndeks(int[] tab) {
        if (tab.length % 2 == 0) {
            return tab.length / 2 - 1;
        } else return tab.length / 2;
    }

    public static void writeTab_Indeks(int[] tab, int index) {

        for (int i = 0; i <= index; i++) {
            System.out.println(tab[i]);

        }
    }
        public static void writeFromTab_Indeks( int[] tab, int index){

            for (int i = index; i < tab.length; i++){
                System.out.println(tab[i]);
            }
        }
    }

