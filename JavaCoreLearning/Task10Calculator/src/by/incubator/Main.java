package by.incubator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        switchCalculator();
    }


    public static void switchCalculator(){
        System.out.println("Выберите калькулятор: 1 - обычный калькулятор, 2 - странный калькулятор");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        int[] intOperands;
        double[] doubleOperands;
        int typeOfNumbers;
        char typeOfOperation;
        switch (choose){
            case 1:
                typeOfOperation = typeOfOperationTake();
                System.out.println("Выберите тип чисел, над которыми будете совершать действия: 1 - целые, 2 - с дробной частью");
                typeOfNumbers = scanner.nextInt();
                switch (typeOfNumbers){
                    case 1:
                       intOperands = intOperandsTake();
                       Calculator.callMethod(typeOfOperation,intOperands[0],intOperands[1]);
                        break;
                    case 2:
                        doubleOperands = doubleOperandsTake();
                        Calculator.callMethod(typeOfOperation,doubleOperands[0], doubleOperands[1]);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + typeOfNumbers);
                }
                break;
            case 2:
                typeOfOperation = typeOfOperationTake();
                System.out.println("Выберите тип чисел, над которыми будете совершать действия: 1 - целые, 2 - дроби");
                typeOfNumbers = scanner.nextInt();
                switch (typeOfNumbers){
                    case 1:
                        intOperands = intOperandsTake();
                        WeirdCalculator.callMethod(typeOfOperation,intOperands[0],intOperands[1]);
                        break;
                    case 2:
                        doubleOperands = doubleOperandsTake();
                        WeirdCalculator.callMethod(typeOfOperation,doubleOperands[0], doubleOperands[1]);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + typeOfNumbers);
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + choose);
        }
    }


    public static char typeOfOperationTake(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите одну из операций: +, -, /, *; #, $ для странного калькулятора");
        String operation = scanner.next();
        char op = operation.charAt(operation.length()-1);
        return op;
    }

    public static int[] intOperandsTake(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд");
        int operand1 = scanner.nextInt();
        System.out.println("Введите второй операнд");
        int operand2 = scanner.nextInt();
        int[] operands = new int[2];
        operands[0]=operand1;
        operands[1]=operand2;
        return operands;
    }

    public static double[] doubleOperandsTake(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый операнд");
        double operand1 = scanner.nextDouble();
        System.out.println("Введите второй операнд");
        double operand2 = scanner.nextDouble();
        double[] operands = new double[2];
        operands[0]=operand1;
        operands[1]=operand2;
        return operands;
    }


}
