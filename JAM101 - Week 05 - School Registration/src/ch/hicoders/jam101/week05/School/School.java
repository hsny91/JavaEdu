package ch.hicoders.jam101.week05.School;
import java.util.Scanner;
import java.util.ArrayList;

public class School {
    private ArrayList<Student> firstClass = new ArrayList<>();
    private ArrayList<Student> secondClass = new ArrayList<>();
    private ArrayList<Student> thirdClass = new ArrayList<>();
    private ArrayList<Student> fourthClass = new ArrayList<>();
    private ArrayList<Student> fifthClass = new ArrayList<>();

    /**
     * Kullanicidan alinan ogrenci bilgileri dogrultusunda 10 tane ogrenci olusturan ve onu arrayliste atan method
     *
     * @return
     */
    public static ArrayList<Student> setStudentData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<Student>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Please write student name");
            String name = scanner.next();
            System.out.println("Please write student surname");
            String surname = scanner.next();
            System.out.println("Please write student age");
            int age = scanner.nextInt();
            if(age<6 || age>10){
                System.out.println("Please enter a value between 6 and 10");
                int studentAge = scanner.nextInt();
                age=studentAge;
            }
            String schoolNo = (name.substring(0, 2) + surname.substring(surname.length() - 3)).toUpperCase() + age;
            Student student = new Student(name, surname, age, schoolNo);
            studentsList.add(student);
        }
        return studentsList;
    }

    /**
     * Siniflarin icine yaslarina gore ogrencileri yerlestiren method.
     *
     * @param pStudentList
     * @return
     */
    public void setClassroomData(ArrayList<Student> pStudentList) {
        for (Student student : pStudentList) {
            if (student.studentAge == 6) {
                firstClass.add(student);
            } else if (student.studentAge == 7) {
                secondClass.add(student);
            } else if (student.studentAge == 8) {
                thirdClass.add(student);
            } else if (student.studentAge == 9) {
                fourthClass.add(student);
            } else if (student.studentAge == 10) {
                fifthClass.add(student);
            }
        }
    }
    /***
     * Butun ögrenci bilgilerinin ekrada gösterilmesi
     */
    public void viewToAllStudent(){
        viewToStudent(firstClass,"First Class");
        viewToStudent(secondClass,"Second Class");
        viewToStudent(thirdClass,"Thirds Class");
        viewToStudent(fourthClass,"Fourth Class");
        viewToStudent(fifthClass,"Fifth Class");
    }

    /**
     * Ogrenci bilgilerinin ekranda gösterilmesi
     * @param pStudentList
     * @param pClassName
     */
    private void viewToStudent(ArrayList<Student> pStudentList,String pClassName) {
        for (Student student : pStudentList) {
            System.out.println("Student name and surname: "+student.studentName
                            + " Student age: " + student.studentAge
                            +  " Student no:"+ student.schoolNo
                            +  " Student class: "+pClassName
            );
        }
    }
}
