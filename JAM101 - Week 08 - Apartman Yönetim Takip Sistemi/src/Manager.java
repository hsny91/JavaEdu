import java.util.ArrayList;
import java.util.Random;

import static java.lang.StrictMath.round;

public class Manager {
    private static final double totalAidatPrice=(3000);
    private static final double maxAidatPrice=750;

    /**
     * Aidatlari olusturan method
     * @return
     */
    public static ArrayList<Aidat> createAidat() {
        ArrayList<Aidat> aidatList = new ArrayList<Aidat>();
        Random random=new Random(); //random sınıfı

        for (int index = 1; index <= 12; index++) {
            int oneOrZero = (Math.random()>=0.5)? 1 : 0;// aidatin odenip odenmedigi random olarak belirtiliyor.
            if(oneOrZero==1){ //aidat odenmis ise ne kadar odendigi random olarak belirtiliyor.
                double randomNumber=random.nextDouble()*maxAidatPrice;
                Aidat aidat = new Aidat(index, randomNumber);
                aidat.setPaymentStatus(true);
                aidatList.add(aidat);
            }
            else{ //aidatin odenmemesi durumdan
                Aidat aidat = new Aidat(index);
                aidat.setPaymentStatus(false);
                aidatList.add(aidat);
            }

        }

        return aidatList;
    }

    /**
     * Daireyi olusturan ve aidatlari icine atan method
     */
    public static void createDaire() {
        for (int index = 1; index <= 3; index++) {
            ArrayList<Aidat> totalAidatLıst=createAidat();
            Daire daire = new Daire(totalAidatLıst, index);
            double totalAidat=findTotalAidat(daire.getDaireList());
            double financialStatement=findFinancialStatement(totalAidat);
            showFinancialStatement(financialStatement,daire.getDaireNo());
            /*for (Aidat aidat : daire.getDaireList()) {
                System.out.println( aidat.mounthNumber+" ay numarasi: "+
                        " miktar :"+aidat.amountOfPaid +

                        " status:  "+ aidat.paymentStatus);
            }*/
        }
    }

    /**
     * Dairelerin yillik ne kadar ödediklerini bulan method
     * @param pAidatList
     * @return
     */
    public static double findTotalAidat( ArrayList<Aidat> pAidatList) {
        double total=0;
        for (Aidat aidat : pAidatList) {
            total+=aidat.amountOfPaid;
        }
        return round(total);
    }

    /**
     * Yil sonu bilancosunu hesaplayan method
     * @param pTotalAidat
     * @return
     */
    public static double findFinancialStatement(double pTotalAidat){
        double result=pTotalAidat-totalAidatPrice;
        return round(result);
    }

    /**
     * Bilancoyu ekranda gösteren method
     * @param result
     * @param pNumberDaire
     */
    public static void showFinancialStatement(double result,int pNumberDaire){
        System.out.println(pNumberDaire+". Daire Yil sonu bilancosu: "+result+ " Fr");

    }

    /**
     * Manageri Baslatan method
     */
    public static void start(){
        createDaire();
    }
}
