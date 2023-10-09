import iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.atender();
        iphone.ligar();
        iphone.iniciarCorreioVoz();

        iphone.adicionarNovaPagina();
        iphone.atualizarPagina();
        iphone.exibirPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
