package by.incubator;

public class Calculator {

    private final static char addition = '+';
    private final static char subtraction = '-';
    private final static char division = '/';
    private final static char multiplication = '*';


    public static void callMethod(char typeOfOperation, int operand1, int operand2){
        switch (typeOfOperation){
            case addition:
                makeAddition(operand1,operand2);
                break;
            case subtraction:
                makeSubtraction(operand1,operand2);
                break;
            case division:
                makeDivision(operand1,operand2);
                break;
            case multiplication:
                makeMultiplication(operand1,operand2);
                break;
            default:
                System.out.println("Такая операция отсутствует");

        }
    }

    public static void callMethod(char typeOfOperation, double operand1, double operand2){
        switch (typeOfOperation){
            case addition:
                makeAddition(operand1,operand2);
                break;
            case subtraction:
                makeSubtraction(operand1,operand2);
                break;
            case division:
                makeDivision(operand1,operand2);
                break;
            case multiplication:
                makeMultiplication(operand1,operand2);
                break;
            default:
                System.out.println("Такая операция отсутствует");

        }
    }


    public static void makeAddition(int operand1, int operand2){
        int sum = operand1 + operand2;
        System.out.println("Результат сложения чисел " + operand1 + " и " + operand2 + " = " + sum);
    }

    public static void makeSubtraction(int operand1, int operand2){
        int sub = operand1 - operand2;
        System.out.println("Результат вычитания чисел " + operand1 + " минус " + operand2 + " = " + sub);
    }

    public static void makeDivision(int operand1, int operand2){
        double div = operand1/operand2;
        System.out.println("Результат деления чисел " + operand1 + " делить на " + operand2 + " = " + div);
    }

    public static void makeMultiplication(int operand1, int operand2){
        double multi = operand1*operand2;
        System.out.println("Результат умножения чисел " + operand1 + " и " + operand2 + " = " + multi);
    }

    public static void makeAddition(double operand1, double operand2){
        double sum = operand1 + operand2;
        System.out.println("Результат сложения чисел " + operand1 + " и " + operand2 + " = " + sum);
    }

    public static void makeSubtraction(double operand1, double operand2){
        double sub = operand1 - operand2;
        System.out.println("Результат вычитания чисел " + operand1 + " минус " + operand2 + " = " + sub);
    }

    public static void makeDivision(double operand1, double operand2){
        double div = operand1/operand2;
        System.out.println("Результат деления чисел " + operand1 + " делить на " + operand2 + " = " + div);
    }

    public static void makeMultiplication(double operand1, double operand2){
        double multi = operand1*operand2;
        System.out.println("Результат умножения чисел " + operand1 + " и " + operand2 + " = " + multi);
    }



}
