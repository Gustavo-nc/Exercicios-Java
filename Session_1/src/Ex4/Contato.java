package Ex4;

public class Contato {
    String nome;
    String sobrenome;
    long telefone;
    String email;
    Contato(String nome, String sobrenome, long telefone, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.email = email;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Sobrenome: " + sobrenome + ", Telefone: " + telefone + ", Email: " + email;
    }
}
