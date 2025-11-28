package imc;

import java.util.Scanner;

public class Calculoimc {
    public static void main(String[] args) {
        
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
        scanner.close();
}

}
