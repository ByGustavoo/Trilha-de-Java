import br.com.trilha.classes.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Música
        System.out.println("\n");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();

        System.out.println("\n");

        //Telefônico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\n");

        //Internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}