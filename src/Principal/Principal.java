package Principal;

import MinhasAvalicoes.Avalicoes;
import Modelos.Musica;
import Modelos.PodCast;

public class Principal {
    public static void main(String[] args) {

        Musica minhasMusicas = new Musica();
        minhasMusicas.setTitulo("I my blood");
        minhasMusicas.setCantor("Shawn Mendes");

        for (int i = 0; i < 1000; i++){
            minhasMusicas.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            minhasMusicas.curte();
        }

        PodCast meusPodCasting = new PodCast();
        meusPodCasting.setTitulo("Marcos Oliveira");
        meusPodCasting.setDescricao("Bolha Dev");

        for (int i = 0; i < 3000; i++){
            meusPodCasting.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            meusPodCasting.curte();
        }

        Avalicoes avalia = new Avalicoes();
        avalia.inclui(minhasMusicas);
        avalia.inclui(meusPodCasting);

    }
}
