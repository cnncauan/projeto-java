package aulas;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        String[] position = {"Maria", "edu", "vivi"};
        String[] receive = metodo(position);

        for (int i = 0; i < position.length; ++i){
            System.out.println(receive[i]);
        }
    }

    public static String[] metodo(String[] positionFinal ) {
        String[] positionStar = new String[positionFinal .length];

        for (int i = 0, j = positionFinal .length - 1; i < positionFinal .length; ++i, --j){
            positionStar[i] = positionFinal [j];
        }

        return positionStar;
    }
}
