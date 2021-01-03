import ch.hicoders.jam101.week05.School.School;
import ch.hicoders.jam101.week05.School.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        School school = new School();
        // Okul Classi oncelikle ogrencileri olusturuyor.
         ArrayList<Student> studentList = school.setStudentData();
         //Olusturulan ogenciler siniflara yaslarina göre dagitiliyor.
         school.setClassroomData(studentList);
         //Bütün ögrenciler ekrana yazdiriliyor.
         school.viewToAllStudent();
    }
}


