public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        // Chamando os métodos da interface ReprodutorMusical
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica();

        // Chamando os métodos da interface AparelhoTelefonico
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        // Chamando os métodos da interface NavegadorInternet
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}

