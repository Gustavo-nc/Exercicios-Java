package Ex2;

public class Livro {
    String titulo;
    String autor;
    double preco;
    int paginas;
    int anoPublicacao;
    Livro(String titulo,String autor,double preco,int paginas,int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.paginas = paginas;
        this.anoPublicacao = anoPublicacao;
    }
    void  mostrarLivro() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Páginas: " + paginas);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }
}
