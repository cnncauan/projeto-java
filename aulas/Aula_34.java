package aulas;

public class Aula_34 {

    public static void main(String[] args) {

        double[][] x = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for(int i = 0; i < x.length; ++i){
            for(int j = 0; j < x[i].length; ++j){
                System.out.print(i + "|" + j + " = " + x[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}