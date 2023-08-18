import device.Iphone;
import device.Mp4;

public class App {
    public static void main(String[] args) {
        Iphone celularIphone = new Iphone("123456789", "The Sound of Silence", "dio.me");

        celularIphone.ligar();
        celularIphone.atender();
        celularIphone.adicionarNovaAba();
        celularIphone.exibirPagina();
        celularIphone.tocar();

        Mp4 mp4 = new Mp4();

        mp4.selecionarMusica();
        mp4.tocar();
    }
}
