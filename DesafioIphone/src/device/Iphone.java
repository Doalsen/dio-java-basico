package device;

import internet.NavegadorInternet;
import musica.ReprodutorMusical;
import telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    private String numeroTelefone = "";
    private String nomeMusica = "";
    private String enderecoUrl = "";
    
    public Iphone(String numeroTelefone, String nomeMusica, String enderecoUrl) {
        this.numeroTelefone = numeroTelefone;
        this.nomeMusica = nomeMusica;
        this.enderecoUrl = enderecoUrl;
    }


    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getEnderecoUrl() {
        return enderecoUrl;
    }

    public void setEnderecoUrl(String enderecoUrl) {
        this.enderecoUrl = enderecoUrl;
    }

    public void exibirPagina() {
        System.out.println("Exibindo o página do endereço: " + getEnderecoUrl());
    }

    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    public void tocar() {
        System.out.println("Tocando a música " + getNomeMusica());
    }

    public void pausar() {
        System.out.println("Múcisa pausada");
    }

    public void selecionarMusica() {
        System.out.println("Nova música selecionada");
    }

    public void ligar() {
        System.out.println("Ligando para o número " + getNumeroTelefone());
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado");
    }
}
