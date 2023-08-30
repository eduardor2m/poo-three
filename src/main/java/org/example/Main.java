package org.example;

import functions.*;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static IsPair isPair = new IsPair();
    static Calculator calculator = new Calculator();
    static GetNumberVowels getNumberVowels = new GetNumberVowels();
    static Tax tax = new Tax();
    static Area area = new Area();
    static Convert convert = new Convert();
    static CalculateVector calculateVector = new CalculateVector();

    public static void main(String[] args) {
        System.out.print("""
                Escolha uma operação:
                1. Verificar se o número é Par
                2. Fazer Calculos
                3. Número de Vogais
                4. Calculator Tax
                5. Calcular Área e Perímetro
                6. Converter Temperatura
                7. Popular vetor e pedir a soma
                8. Criar 10 pessoas e retornar o nome da mais velha e o nome da mais nova
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
            case 4 -> getTax();
            case 5 -> getArea();
            case 6 -> convertFahrenheitToCelsius();
            case 7 -> calculateVector();
            case 8 -> makePeople();
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

    public static void getTax() {
        System.out.print("Digite o seu salário bruto: ");
        float salary = scan.nextFloat();

        float tax = Tax.calculatorTax(salary);

        System.out.println("O desconto no seu salário foi de " + tax + " reais");
    }

    public static void getArea() {
        System.out.print("Digite a comprimento do retângulo: ");
        float b = scan.nextFloat();

        System.out.print("Digite a largura do retângulo: ");
        float h = scan.nextFloat();

        float area = Area.calculatorArea(b, h);
        float perimeter = Area.calculatorPerimeter(b, h);

        System.out.println("A área é " + area + " \nO perímetro é: " + perimeter);
    }

    public static void convertFahrenheitToCelsius() {
        System.out.print("1. Transformar de fahrenheit para celsius \n 2. Transformar de Celsius para Fahrenheit ");

        int option = scan.nextInt();

        switch (option) {
            case 1 -> {
                System.out.print("Digite a temperatura em fahrenheit: ");
                int fahrenheit = scan.nextInt();
                int celsius = convert.transformFahrenheiteToCelsius(fahrenheit);
                System.out.println("A temperatura em celsius é: " + celsius);
            }
            case 2 -> {
                System.out.print("Digite a temperatura em celsius: ");
                int celsius = scan.nextInt();
                int fahrenheit = convert.transformCelsiusToFahrenheit(celsius);
                System.out.println("A temperatura em fahrenheit é: " + fahrenheit);
            }
            default -> System.out.println("Opção Inválida");
        }

    }

    public static void calculateVector() {
        System.out.print("Digite o tamanho do vetor: ");
        int size = scan.nextInt();

        float[] vector = new float[size];

        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            vector[i] = scan.nextFloat();
        }

        float sum = CalculateVector.calculateVector(vector);

        System.out.println("A soma do vetor: " + sum);
    }

    public static void makePeople() {
        System.out.print("Digite o número de pessoas: ");
        int size = scan.nextInt();

        Person[] people = new Person[size];

        for (int i = 0; i < people.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String name = scan.next();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int age = scan.nextInt();

            people[i] = new Person(name, age);
        }

        Person olderPerson = people[0];
        Person youngerPerson = people[0];
        int counter = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() > olderPerson.getAge()) {
                olderPerson = people[i];
            }

            if (people[i].getAge() < youngerPerson.getAge()) {
                youngerPerson = people[i];
            }

            if (people[i].getAge() >= 18) {
                System.out.println(people[i].getName());
                counter++;
            }
        }

        System.out.println("A pessoa mais velha é: " + olderPerson.getName());
        System.out.println("A pessoa mais nova é: " + youngerPerson.getName());
        System.out.println("Pessoas acima de 18 anos: " + counter);
    }
}