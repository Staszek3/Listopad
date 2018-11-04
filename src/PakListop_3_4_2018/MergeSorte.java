package PakListop_3_4_2018;

import java.util.Arrays;

public class MergeSorte {
    public static void main(String[] args) {
        int[] tab = new int[]{1, 4, 7, 9, 4, 6, 9};
        int[] tab1 = new int[]{9, 4, 6, 9};
        int[] tab2 = new int[]{1, 4, 7, 9};
        int[] tab3 = new int[]{2, 3, 7};

        zad1(tab);
        zad2(tab1, tab2);
        zad3(tab2, tab3);
        zad3(tab3, tab2);

    }

    public static void zad1(int[] input) {
        int polowa = input.length / 2;
        int polowaEnd = input.length - polowa;
        int[] b = new int[polowa];
        int[] c = new int[polowaEnd];

        for (int i = 0; i < input.length; i++) {
            if (i < polowa) {
                b[i] = input[i];

            } else {
                c[i - polowa] = input[i];
            }


        }
        System.out.println();
        for (int l : b) {
            System.out.println(l);
        }

        System.out.println();
        for (int g : c) {
            System.out.println(g);

        }
        System.out.println();
        System.out.println(Arrays.toString(c));
    }

    public static void zad2(int[] input1, int[] input2) {
        int[] suma = new int[input1.length + input2.length];
        for (int i = 0; i < input1.length; i++) {
            suma[2 * i] = input1[i];
            suma[2 * i + 1] = input2[i];
        }
        System.out.println(Arrays.toString(suma));
    }

    public static void zad3(int[] input1, int[] input2) {
        int[] suma = new int[input1.length + input2.length];
        {
            if (input1.length > input2.length) {
                for (int i = 0; i < input2.length; i++) {
                    suma[2 * i] = input1[i];
                    suma[2 * i + 1] = input2[i];
                }
                //   int calosc = input1.length + input2.length;€
                for (int j = 0; j < input1.length - input2.length; j++) {
                    suma[2 * input2.length + j] = input1[input2.length + j];
                }
            } else {
                for (int k = 0; k < input1.length; k++) {
                    suma[2 * k] = input2[k];
                    suma[2 * k + 1] = input1[k];
                }
                //   int calosc = input1.length + input2.length;
                for (int n = 0; n < input2.length - input1.length; n++) {
                    suma[2 * input1.length + n] = input2[input1.length + n];
                }
              //  System.out.println();
                //System.out.println(Arrays.toString(suma));
            }
            System.out.println();
            System.out.println(Arrays.toString(suma));
        }
    }


    }

