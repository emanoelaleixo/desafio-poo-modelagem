public class Main {
    public static void main(String[] args) {

        Smartphone meuSmartphone = new Smartphone();

        // Testando Reprodutor Musical
        meuSmartphone.selecionarMusica("Geração Coca-Cola - Legião Urbana");
        meuSmartphone.tocar();
        meuSmartphone.pausar();

        // Testando Aparelho Telefônico
        meuSmartphone.ligar("27988771234");
        meuSmartphone.atender();
        meuSmartphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuSmartphone.exibirPagina("https://www.dio.me");
        meuSmartphone.adicionarNovaAba();
        meuSmartphone.atualizarPagina();

    }
}
