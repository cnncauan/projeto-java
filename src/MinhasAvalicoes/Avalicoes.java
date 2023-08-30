package MinhasAvalicoes;

import Modelos.Audio;

public class Avalicoes {
    public void inclui(Audio audio){
        if (audio.getClassificacao() > 9) {
            System.out.println(audio.getTitulo() + " Muito bem recomendado!");
        } else {
            System.out.println(audio.getTitulo() + " Basiquinho :p");
        }
    }

}
