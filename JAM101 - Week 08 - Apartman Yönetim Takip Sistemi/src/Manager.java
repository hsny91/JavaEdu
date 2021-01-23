import java.util.ArrayList;
import java.util.Random;

public class Manager {
    private static final double totalAidatPrice=(3000);

    public static ArrayList<Aidat> createAidat() {
        ArrayList<Aidat> aidatList = new ArrayList<Aidat>();
        for (int i = 1; i <= 12; i++) {
            Random random=new Random(); //random sınıfı
            double randomNumber=random.nextDouble()*200;
            Aidat aidat = new Aidat(i, randomNumber);
            aidatList.add(aidat);
        }
        return aidatList;
    }

    public static void createDaire() {
        for (int i = 1; i <= 5; i++) {
            ArrayList<Aidat> totalAidatLıst=createAidat();
            Daire daire = new Daire(totalAidatLıst, i);
            double totalAidat=findTotalAidat(daire.getDaireList());
            double financialStatement=findFinancialStatement(totalAidat);
            showFinancialStatement(financialStatement,daire.getDaireNo());
            /*for (Aidat aidat : daire.getDaireList()) {
                System.out.println(+aidat.amountOfPaid + " " + aidat.mounthNumber);
            }*/
        }
    }
    public static double findTotalAidat( ArrayList<Aidat> pAidatList) {
        double total=0;
        for (Aidat aidat : pAidatList) {
            total+=aidat.amountOfPaid;
        }
        System.out.println(total);
        return total;
    }
    public static double findFinancialStatement(double pTotalAidat){
        double result=pTotalAidat-totalAidatPrice;
        int intResult = (int) result;
        return intResult;
    }
    public static void showFinancialStatement(double result,int pNumberDaire){
        System.out.println(pNumberDaire+". Daire Yil sonu bilancosu: "+result);

    }
    public static void start(){
        createDaire();
    }
}
