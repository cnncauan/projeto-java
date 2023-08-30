package aulas;
import java.util.Scanner;
public class Aula_41 {
    public static void main(String[] args) {
        int[] aaa = {1,2,3};
        int[] recebeMetodo = metodo(aaa);

        for (int i = 0; i < recebeMetodo.length; i++){
            System.out.println(recebeMetodo[i]);
        }

    }

    public static int[] metodo(int[] abc) {
        int[] bbb = new int[abc.length];

        for (int i = 0, j = bbb.length - 1; i < bbb.length; ++i, --j){
            bbb[j] = abc[i];
        }

        return bbb;
    }
}
