package ch.hicoders.jam101.week05.School;

public class Student {
    //ogrenci bilgileri
    public String studentName;
    public String studentSurName;
    public int studentAge;
    public String schoolNo;
    public Student studentList;

    public Student(String pStudentName,String PStudentSurName,int pStudentAge,String PSchoolNo){ ;
        this.studentName=pStudentName;
        this.studentSurName=PStudentSurName;
        this.studentAge=pStudentAge;
        this.schoolNo=PSchoolNo;
    }
}
