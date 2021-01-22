
import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static ArrayList<Aidat> aidatList = new ArrayList<Aidat>();
    private static final double totalAidatPrice=(6250);
    public static void main(String args[]) {
        ArrayList<Aidat> totalAidatList=createAidat() ;
        createDaire(totalAidatList);

    }

    public static ArrayList<Aidat> createAidat() {
        for (int i = 1; i <= 12; i++) {
            Random random=new Random(); //random sınıfı
            double randomNumber=random.nextDouble()*500;
            Aidat aidat = new Aidat(i, randomNumber);
            aidatList.add(aidat);
        }
        return aidatList;
    }

    public static void createDaire( ArrayList<Aidat> pAidatList) {
        for (int i = 1; i <= 12; i++) {
            Daire daire = new Daire(pAidatList, i);
            double totalAidat=findTotalAidat(daire.getDaireList());
            double financialStatement=findFinancialStatement(totalAidat);
            //System.out.println(totalAidat);
           // System.out.println(financialStatement);
            showFinancialStatement(financialStatement,daire.getDaireNo());
        }
    }
    public static double findTotalAidat( ArrayList<Aidat> pAidatList) {
        double total=0;
        for (Aidat aidat : pAidatList) {
           total+=aidat.amountOfPaid;
        }
        return total;
    }
    public static double findFinancialStatement(double pTotalAidat){
        double result=totalAidatPrice-pTotalAidat;
        return result;
    }
    public static void showFinancialStatement(double result,int pNumberDaire){
        System.out.println(pNumberDaire+". Daire Yil sonu bilancosu: "+result);

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

 /* for (Aidat aidat : daire.getDaireList()) {
            System.out.println(aidat.mounthNumber);
        }*/

/* for (Aidat aidat : daire.getDaireList()) {
                System.out.println(+aidat.amountOfPaid+ " "+ aidat.mounthNumber);
            }*/