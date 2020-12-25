package ch.hicoders.jam101.week05.School;

import java.util.ArrayList;
import java.util.Scanner;

public class Classroom {
    public static ArrayList<Student> studentsList;
    public static ArrayList<Student> firstClass;
    public ArrayList<Student> secondClass;
    public ArrayList<Student> thirdClass;
    public ArrayList<Student> fourthClass;
    public ArrayList<Student> fifthClass;
    public Classroom() {
        studentsList = new ArrayList<>();
        firstClass = new ArrayList<>();
        secondClass = new ArrayList<>();
        thirdClass = new ArrayList<>();
        fourthClass = new ArrayList<>();
        fifthClass = new ArrayList<>();
    }
    public static void setStudentData() {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Student> studentsList = new ArrayList<Student>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Please write student name");
            String name = scanner.next();
            System.out.println("Please write student surname");
            String surname = scanner.next();
            System.out.println("Please write student age");
            int age = scanner.nextInt();
            String schoolNo= name.substring(0,1)+surname.substring(surname.length()-3)+age;
            Student student = new Student(name, surname, age, schoolNo);
            studentsList.add(student);
        }

    }

    public static void renderArray(){
        for(Student student:studentsList)
        {
            System.out.println(student.studentName+student.schoolNo);
        }
    }


}
