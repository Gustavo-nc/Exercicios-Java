package Ex1;

public class Main {
    public static void main(String[] args) {
        Lampada lampada1 = new Lampada();
        lampada1.addLampada("Philips", 120, 24, "LED", "Amarelo", 150.0);
        System.out.println("Informações da Lâmpada: ");

        System.out.printf("Lâmpada: %s%n", lampada1.marca);
        System.out.printf("Voltagem: %.2f V%n", lampada1.voltagem);
        System.out.printf("Garantia: %d meses%n", lampada1.garantia);
        System.out.printf("Tipo: %s%n", lampada1.tipo);
        System.out.printf("Cor: %s%n", lampada1.cor);
        System.out.printf("Valor: R$ %.2f%n", lampada1.valor);
    }
}
