public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Carlos Silva");
        Pessoa pessoa2 = new Pessoa("Maria Souza");
        Pessoa pessoa3 = new Pessoa("Joao Mendes");
        Pessoa pessoa4 = new Pessoa("Ana Lima");
        Pessoa pessoa5 = new Pessoa("Pedro Almeida");

        pessoa1.adicionarFuncao(new Ator("Protagonista"));
        pessoa2.adicionarFuncao(new Ator("Antagonista"));
        pessoa3.adicionarFuncao(new Diretor());
        pessoa4.adicionarFuncao(new Roteirista());
        pessoa5.adicionarFuncao(new Cinegrafista());

        Filme filme = new Filme("Aventura na Selva", 2023, pessoa3, pessoa4, "Trilha Sonora 1");
        filme.adicionarPessoaAoElenco(pessoa1);
        filme.adicionarPessoaAoElenco(pessoa2);
        filme.adicionarPessoaAoElenco(pessoa5);

        pessoa1.adicionarFilme(filme);
        pessoa2.adicionarFilme(filme);
        pessoa3.adicionarFilme(filme);
        pessoa4.adicionarFilme(filme);
        pessoa5.adicionarFilme(filme);

        filme.exibirDetalhes();

        System.out.println("\nFilmografias:");
        pessoa1.exibirFilmografia();
        pessoa2.exibirFilmografia();
        pessoa3.exibirFilmografia();
        pessoa4.exibirFilmografia();
        pessoa5.exibirFilmografia();
    }
}
