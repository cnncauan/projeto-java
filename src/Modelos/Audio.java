package Modelos;

public abstract class Audio {
    private String titulo;
    private int totalDeCurtidas;
    private int totalDeReproducoes;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.totalDeCurtidas++;
    }

    public void reproduz(){
        this.totalDeReproducoes++;
    }

}
