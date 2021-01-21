import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Aidat> aidatList = new ArrayList<Aidat>();
        for(int i = 1; i <=12; i++) {
            Aidat aidat = new Aidat(i, 200);
            aidatList.add(aidat);
        }
        Daire daire =new Daire(aidatList);
        System.out.println(daire);
    }



    }


/*   ArrayList<Student> studentsList = new ArrayList<Student>(studentsNumber);
        for(int i = 0; i <= studentsNumber; i++){
            int mathScore = randomNumber.nextInt(7);
            int germanScore = randomNumber.nextInt(7);
            Student student = new Student( "Student "+i, mathScore, germanScore);
            studentsList.add(student);
        }
        for (Aidat aidat : aidatList) {
            System.out.println(aidat.mounthNumber);
        }*/