package domain;

public record Iphone() implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("ligando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("selecionando música " + musica);
    }
}
