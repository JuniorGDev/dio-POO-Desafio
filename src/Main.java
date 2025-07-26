import domain.Iphone;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static int option = -1;

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        System.out.println("Iniciando Iphone...");
        while (option != 0) {
            System.out.println("\n===IPHONE===");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Ligar");
            System.out.println("2 - Atender");
            System.out.println("3 - Iniciar Correio de Voz");
            System.out.println("4 - Exibir Página");
            System.out.println("5 - Adicionar Nova Aba");
            System.out.println("6 - Atualizar Página");
            System.out.println("7 - Tocar");
            System.out.println("8 - Pausar");
            System.out.println("9 - Selecionar Música");
            System.out.println("0 - Desligar");
            System.out.println("Digite a opção desejada:");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> ligar(iphone);
                case 2 -> iphone.atender();
                case 3 -> iphone.iniciarCorreioVoz();
                case 4 -> exibirPagina(iphone);
                case 5 -> iphone.adicionarNovaAba();
                case 6 -> iphone.atualizarPagina();
                case 7 -> iphone.tocar();
                case 8 -> iphone.pausar();
                case 9 -> selecionarMusica(iphone);
                case 0 -> desligar();
                default -> System.out.println("Iphone não reconhece essa opção.");
            }
        }
    }

    public static void ligar(Iphone iphone) {
        System.out.println("Digite o número para ligar:");
        String numero = scanner.next();
        iphone.ligar(numero);
    }

    public static void exibirPagina(Iphone iphone) {
        System.out.println("Digite a URL para exibir a página:");
        String url = scanner.next();
        iphone.exibirPagina(url);
    }

    public static void selecionarMusica(Iphone iphone) {
        System.out.println("Digite o nome da música para selecionar:");
        String musica = scanner.next();
        iphone.selecionarMusica(musica);
    }

    public static void desligar() {
        System.out.println("Desligando Iphone...");
        System.exit(0);
    }
}
