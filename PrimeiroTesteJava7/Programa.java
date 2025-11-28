package PrimeiroTesteJava7;
public class Programa {
    public static void main(String[] args) {

        System.out.println("=== Teste de Pessoas ===");
        Pessoa p1 = new Pessoa("Julia", 19);
        Pessoa p2 = new Pessoa("Marcos", 30);

        p1.apresentar();
        p2.apresentar();

        System.out.println("\n=== Teste da Calculadora ===");
        Calculadora calc = new Calculadora();

        int a = 8;
        int b = 2;

        System.out.println("Somar: " + calc.somar(a, b));
        System.out.println("Subtrair: " + calc.subtrair(a, b));
        System.out.println("Multiplicar: " + calc.multiplicar(a, b));
        System.out.println("Dividir: " + calc.dividir(a, b));

        System.out.println("\n=== Teste de Array ===");
        Pessoa[] pessoas = { p1, p2, new Pessoa("Ana", 18) };

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Pessoa " + (i + 1) + ": " + pessoas[i].getNome());
        }
    }
}
