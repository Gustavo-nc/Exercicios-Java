package Ex1;

public class Lampada {
    String marca;
    double voltagem;
    int garantia;
    String tipo;
    String cor;
    double valor;

    void addLampada(String marca, double voltagem, int garantia,  String tipo, String cor, double valor) {
        this.marca = marca;
        this.voltagem = voltagem;
        this.garantia = garantia;
        this.tipo = tipo;
        this.cor = cor;
        this.valor = valor;
    }

}
