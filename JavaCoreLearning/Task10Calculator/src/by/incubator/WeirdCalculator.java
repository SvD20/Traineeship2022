package by.incubator;

public final class WeirdCalculator extends Calculator{

    private final static char dollars = '$';
    private final static char lattice = '#';

    public static void callMethod(char typeOfOperation, int operand1, int operand2){
        switch (typeOfOperation){
            case '+':
                makeAddition(operand1,operand2);
                break;
            case '-':
                makeSubtraction(operand1,operand2);
                break;
            case '/':
                makeDivision(operand1,operand2);
                break;
            case '*':
                makeMultiplication(operand1,operand2);
                break;
            case dollars:
                makeDollars(operand1,operand2);
                break;
            case lattice:
                makeLattices(operand1,operand2);
                break;
            default:
                System.out.println("Такая операция отсутствует");

        }
    }

    public static void callMethod(char typeOfOperation, double operand1, double operand2){
        switch (typeOfOperation){
            case '+':
                makeAddition(operand1,operand2);
                break;
            case '-':
                makeSubtraction(operand1,operand2);
                break;
            case '/':
                makeDivision(operand1,operand2);
                break;
            case '*':
                makeMultiplication(operand1,operand2);
                break;
            case dollars:
                makeDollars(operand1,operand2);
                break;
            case lattice:
                makeLattices(operand1,operand2);
                break;
            default:
                System.out.println("Такая операция отсутствует");

        }
    }



    public static void makeAddition(int operand1, int operand2){
        int sum = operand1 + operand2 + 999;
        System.out.println("Результат сложения чисел " + operand1 + " и " + operand2 + " = " + sum);
    }

    public static void makeAddition(double operand1, double operand2){
        double sum = operand1 + operand2 + 999.5;
        System.out.println("Результат сложения чисел " + operand1 + " и " + operand2 + " = " + sum);
    }

    public static void makeSubtraction(int operand1, int operand2){
        int sub = operand1 - operand2 + 15;
        System.out.println("Результат вычитания чисел " + operand1 + " минус " + operand2 + " = " + sub);
    }

    public static void makeSubtraction(double operand1, double operand2){
        double sub = operand1 - operand2 + 15.5;
        System.out.println("Результат вычитания чисел " + operand1 + " минус " + operand2 + " = " + sub);
    }

    public static void makeDollars(int operand1, int operand2){
        int sum = operand1 + operand2;
        System.out.println("Результат сложения долларов " + operand1 + " и " + operand2 + " = " + sum);
    }

    public static void makeDollars(double operand1, double operand2){
        double sum = operand1 + operand2;
        System.out.println("Результат сложения долларов " + operand1 + " и " + operand2 + " = " + sum);
    }

    public static void makeLattices(int operand1, int operand2){
        int sum = operand1 + operand2;
        System.out.println("Результат: ######### " + sum );
    }

    public static void makeLattices(double operand1, double operand2){
        double sum = operand1 + operand2;
        System.out.println("Результат: ######### " + sum );
    }



}
