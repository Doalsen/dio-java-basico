package device;

import musica.ReprodutorMusical;

public class Mp4 implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música.");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
    
}
