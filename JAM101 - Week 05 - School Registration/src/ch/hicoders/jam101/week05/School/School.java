package ch.hicoders.jam101.week05.School;
import java.util.Scanner;
import java.util.ArrayList;
public class School {
    public static void main(String[] args) {
        ArrayList<Student> studentList = setStudentData();
        ArrayList<Classroom> classList = setClassroomData(studentList);
        renderStudentData(classList);

    }

    /**
     * Kullanicidan alinan ogrenci bilgileri dogrultusunda 10 tane ogrenci olusturan method
     */
    private static ArrayList<Student> setStudentData() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentsList = new ArrayList<Student>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Please write student name");
            String name = scanner.next();
            System.out.println("Please write student surname");
            String surname = scanner.next();
            System.out.println("Please write student age");
            int age = scanner.nextInt();
            String schoolNo = name.substring(0, 1) + surname.substring(surname.length() - 3) + age;
            Student student = new Student(name, surname, age, schoolNo);
            studentsList.add(student);
        }
        return studentsList;
    }

    /**
     * 5 tane sinif olusturan ve bunlarin icine yaslarina gore ogrencileri yerlestiren method.
     */
    private static ArrayList<Classroom> setClassroomData(ArrayList<Student> pStudentList) {
        ArrayList<Classroom> classRoomList = new ArrayList<Classroom>();
        for (Student student : pStudentList) {
            if (student.studentAge == 6) {
                Classroom classroom = new Classroom("firstClass", student);
                classRoomList.add(classroom);
            } else if (student.studentAge == 7) {
                Classroom classroom = new Classroom("secondClass", student);
                classRoomList.add(classroom);
            } else if (student.studentAge == 8) {
                Classroom classroom = new Classroom("thirdClass", student);
                classRoomList.add(classroom);
            } else if (student.studentAge == 9) {
                Classroom classroom = new Classroom("fourtClass", student);
                classRoomList.add(classroom);
            } else if (student.studentAge == 10) {
                Classroom classroom = new Classroom("fifthClass", student);
                classRoomList.add(classroom);
            }
        }
        return classRoomList;
    }
     private static void renderStudentData(ArrayList<Classroom> pClassList ){
         for (Classroom classroom : pClassList) {
             System.out.println("Student name and surname: "+classroom.studentList.studentName+" "+classroom.studentList.studentSurName+
                     " Student age: "+classroom.studentList.studentAge+" Student no: "+classroom.studentList.schoolNo+" " +
                     " Student class: "+classroom.className
             );
         }

     }
}