package aulas;

public class Aula_32 {

    public static void main(String[] args) {

        int i;

        // 1 metodo
        System.out.println("Primeiro exemplo:");
        int[] a = new int[10];
        for (i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }

        // 2 metodo
        System.out.println("Segundo exemplo:");
        int[] x = {1,2,3,4,5,6,7,8,9,10};
        for (i = 0; i < x.length; ++i) {
            System.out.println(x[i]);
        }

        // 3 metodo
        System.out.println("Terceiro exemplo:");
        int[] y= new int[10];
        java.util.Arrays.fill(y, 20);
        for (i = 0; i < y.length; ++i) {
            System.out.println(y[i]);
        }

        // 4 metodo
        System.out.println("Quarto exemplo:");
        int[] z= new int[10];
        java.util.Arrays.fill(z, 2, 5, 30);
        for (i = 0; i < z.length; ++i) {
            System.out.println(z[i]);
        }

    }
}