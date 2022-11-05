package by.incubator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input amount of students");
        int amount_of_students = Integer.parseInt(bufferedReader.readLine());
        Student[] students = new Student[amount_of_students];
        String last_name;
        String first_name;
        double averageScore;
        for(int i = 0; i < students.length; i++){
            System.out.println("Input last name of student");
            last_name = bufferedReader.readLine();
            System.out.println("Input first name of student");
            first_name = bufferedReader.readLine();
            System.out.println("Input average score of student");
            averageScore = Double.parseDouble(bufferedReader.readLine());
            students[i] = new Student(last_name,first_name,averageScore);
        }
        double averageScoreAmongAllStudents = 0;
        for(int i = 0; i < students.length; i++){
            averageScoreAmongAllStudents += students[i].getAverageScore();
        }
        averageScoreAmongAllStudents = averageScoreAmongAllStudents/students.length;
        System.out.println(String.format("%.2f",averageScoreAmongAllStudents ));
        for(int i = 0; i < students.length; i++){
            if (students[i].getAverageScore() < averageScoreAmongAllStudents){
                System.out.println(students[i]);
            }
        }
    }
}
