package ch.hicoders.jam101.week05.School;

public class Classroom {
    //classroom clasinin icersinde ogrenci bilgileri ve kacinci sinif oldugu bilgisi tutulur.
    public Student studentList;
    public  String className;

    public Classroom(String pClassname, Student pStudentList) {
        this.className = pClassname;
        this.studentList = pStudentList;

    }

}


