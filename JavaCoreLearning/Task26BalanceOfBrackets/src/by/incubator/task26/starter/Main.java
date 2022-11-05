package by.incubator.task26.starter;

import by.incubator.task26.stringanalysator.Check;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Check check = new Check(new Scanner(System.in).nextLine());
        System.out.println(check.makeCheck());
    }
}
