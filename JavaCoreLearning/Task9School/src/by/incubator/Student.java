package by.incubator;

public class Student {

    private static int number_of_students;
    private String last_name;
    private String first_name;
    private double averageScore;
    private final int number_of_school = 14;

    public Student(String last_name, String first_name, double averageScore) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.averageScore = averageScore;
        number_of_students++;
        System.out.println("Constructor execution - " + number_of_students);
    }

    public static void displayTheNumberOfStudents(){
        System.out.println(number_of_students);
    }

    @Override
    public String toString() {
        return  last_name + " " + first_name + " " + averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }
}
