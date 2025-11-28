package conversorMoeda;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        /* 
        Scanner scanner = new Scanner(System.in);

        double real, resultado;
        int escolha;

        System.out.println("Bem-vindo ao conversor de moedas!");
        System.out.println("Escolha para qual moeda deseja converter: 1 - Dólar, 2 - Euro");

        escolha = scanner.nextInt();

        System.out.print("Insira um valor em real: ");
        real = scanner.nextDouble();

        if (escolha == 1) {
            // Conversão para Dólar
            resultado = real / 5.34;
            System.out.printf("O valor da conversão = %.2f Dólar(s)\n", resultado);
        } else if (escolha == 2) {
            // Conversão para Euro
            resultado = real / 6.19;
            System.out.printf("O valor da conversão = %.2f Euro(s)\n", resultado);
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
                */

        //calculo imc agora
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;
        int idade;
        String sexo;

        System.out.print("Insira seu peso (kg): ");
        peso = scanner.nextDouble();
        System.out.println("Insira sua altura (centimetros): ");
        altura = scanner.nextDouble();
        System.out.println("Insira sua idade: ");
        idade = scanner.nextInt();
        System.out.println("Insira seu sexo (M/F): ");
        sexo = scanner.next();
        imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (sexo.equalsIgnoreCase("M")) {
            if (idade < 20) {
                if (imc < 9.0) {
                    System.out.println("Abaixo do peso");
                } else if (imc <= 23.0) {
                    System.out.println("Peso normal");
                } else {
                    System.out.println("Acima do peso");
                }
            } else {
                if (imc < 10.0) {
                    System.out.println("Abaixo do peso");
                } else if (imc <= 24.0) {
                    System.out.println("Peso normal");
                } else {
                    System.out.println("Acima do peso");
                }
            }
        } else if (sexo.equalsIgnoreCase("F")) {
            if (idade < 20) {
                if (imc < 8.5) {
                    System.out.println("Abaixo do peso");
                } else if (imc <= 22.0) {
                    System.out.println("Peso normal");
                } else {
                    System.out.println("Acima do peso");
                }
            } else {
                if (imc < 9.5) {
                    System.out.println("Abaixo do peso");
                } else if (imc <= 23.5) {
                    System.out.println("Peso normal");
                } else {
                    System.out.println("Acima do peso");
                }
            }
        } else {
            System.out.println("Sexo inválido!");
        }

    }

}
