package device;

import internet.NavegadorInternet;

public class Opera implements NavegadorInternet{

    public void exibirPagina() {
        System.out.println("Página exibida.");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
    
}
