package aulas;

public class TV {
    String fabricante = "Sony";
    int volume = 0;
    boolean ligado = false;

    public void aumentarVolume() {
        if(volume >= 50){
            System.out.println("Volume máximo!");
        } else {
            volume++;
        }

    }
}
