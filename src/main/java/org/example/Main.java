package org.example;

import functions.Calculator;
import functions.GetNumberVowels;
import functions.IsPair;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static IsPair isPair = new IsPair();
    static Calculator calculator = new Calculator();
    static GetNumberVowels getNumberVowels = new GetNumberVowels();

    public static void main(String[] args) {
        System.out.print("""
                Escolha uma operação:
                1. Verificar se o número é Par
                2. Fazer Calculos
                3. Número de Vogais
                0. Sair
                """
        );
        int option = scan.nextInt();

        switch (option) {
            case 0 -> {
            }
            case 1 -> verifyNumberIsPair();
            case 2 -> makeCalculations();
            case 3 -> getNumberOfVowels();
            default -> System.out.println("Opção Inválida");
        }
    }

    public static void verifyNumberIsPair() {
        boolean numberIsPair;

        System.out.print("Digite o número: ");
        int number = scan.nextInt();

        numberIsPair = isPair.isPair(number);

        if (numberIsPair) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é Impar");
        }
    }

    public static void makeCalculations() {
        float numberOne, numberTwo, result;

        System.out.print("""
                Escolha uma operação:
                1. Soma
                2. Subtração
                3. Multiplicação
                4. Divisão
                0. Sair
                """
        );

        int option = scan.nextInt();

        switch (option) {
            case 0 -> {
            }
            case 1 -> {
                numberOne = scan.nextFloat();
                numberTwo = scan.nextFloat();
                result = calculator.sum(numberOne, numberTwo);
                System.out.println("Soma: " + result);
            }
            case 2 -> {
                numberOne = scan.nextFloat();
                numberTwo = scan.nextFloat();
                result = calculator.subtract(numberOne, numberTwo);
                System.out.println("Subtração: " + result);
            }
            case 3 -> {
                numberOne = scan.nextFloat();
                numberTwo = scan.nextFloat();
                result = calculator.divide(numberOne, numberTwo);
                System.out.println("Divisão: " + result);
            }
            case 4 -> {
                numberOne = scan.nextFloat();
                numberTwo = scan.nextFloat();
                result = calculator.multiply(numberOne, numberTwo);
                System.out.println("Multiplicação: " + result);
            }
            default -> System.out.println("Opção Inválida");
        }
    }

    public static void getNumberOfVowels() {
        System.out.print("Digite a palavra: ");
        String word = scan.next();

        int numberVowels = getNumberVowels.getNumberVowels(word);

        System.out.println("A palavra tem " + numberVowels + " vogais");
    }
}