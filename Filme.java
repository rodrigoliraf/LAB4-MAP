import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private Pessoa diretor;
    private Pessoa roteirista;
    private List<Pessoa> elenco;
    private String trilhaSonora;

    public Filme(String titulo, int ano, Pessoa diretor, Pessoa roteirista, String trilhaSonora) {
        this.titulo = titulo;
        this.ano = ano;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.trilhaSonora = trilhaSonora;
        this.elenco = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public void adicionarPessoaAoElenco(Pessoa pessoa) {
        elenco.add(pessoa);
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano: " + ano);
        System.out.println("Diretor: " + diretor.getNome());
        System.out.println("Roteirista: " + roteirista.getNome());
        System.out.println("Trilha Sonora: " + trilhaSonora);
        System.out.println("Elenco: ");
        for (Pessoa pessoa : elenco) {
            pessoa.exibirFuncoes();
        }
    }
}
