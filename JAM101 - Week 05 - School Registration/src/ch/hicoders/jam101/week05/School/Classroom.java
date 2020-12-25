package ch.hicoders.jam101.week05.School;

import java.util.ArrayList;

public class Classroom {
    //classroom clasinda student objesini ve className degiskenini
    public Student studentList;
    public  String className;

    //constructor
    public Classroom(String pClassname, Student pStudentList) {
        this.className=pClassname;
        this.studentList=pStudentList;



    }



    public static void setStudentData() {
        /*Scanner scanner = new Scanner(System.in);
        //ArrayList<Student> studentsList = new ArrayList<Student>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Please write student name");
            String name = scanner.next();
            System.out.println("Please write student surname");
            String surname = scanner.next();
            System.out.println("Please write student age");
            int age = scanner.nextInt();
            String schoolNo= name.substring(0,1)+surname.substring(surname.length()-3)+age;
            if(age==6){
                Student student = new Student(name, surname, age, schoolNo);
                firstClass.add(student);
            }
            else if(age==7){
                Student student = new Student(name, surname, age, schoolNo);
                secondClass.add(student);
            }
            else if(age==8){
                Student student = new Student(name, surname, age, schoolNo);
                thirdClass.add(student);
            }
            else if(age==9){
                Student student = new Student(name, surname, age, schoolNo);
                fourthClass.add(student);
            }
            else if(age==10){
                Student student = new Student(name, surname, age, schoolNo);
                fifthClass.add(student);
            }

        }

    }

    public static void renderArray(){
        for(Student student:firstClass)
        {
            System.out.println(student.studentName+" "+student.schoolNo);
        }*/
    }


}
