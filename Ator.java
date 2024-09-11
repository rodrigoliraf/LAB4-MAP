public class Ator implements Funcao {
    private String papel;

    public Ator(String papel) {
        this.papel = papel;
    }

    @Override
    public String getDescricao() {
        return "Ator " + papel;
    }
}
