import java.util.ArrayList;
import java.util.Random;

import static java.lang.StrictMath.round;

public class Manager {
    private static final double totalAidatPrice=(3000);// 12 aylik toplam aidat
    private static final double maxAidatPrice=750; // 1 ay icin verilecek max aidat

    /**
     * Aidatlari olusturan method
     * @return
     */
    private  ArrayList<Aidat> createAidat() {
        ArrayList<Aidat> aidatList = new ArrayList<Aidat>();
        Random random=new Random();
        for (int index = 1; index <= 12; index++) {
            int oneOrZero = (Math.random()>=0.5)? 1 : 0;// aidatin odenip odenmedigi random olarak belirtiliyor.
            if(oneOrZero==1){ //aidat odenmis ise ne kadar odendigi random olarak belirtiliyor.
                double randomNumber=random.nextDouble()*maxAidatPrice;
                Aidat aidat = new Aidat(index, randomNumber);
                aidat.setPaymentStatus(true);
                aidatList.add(aidat);
            }
            else{ //aidatin odenmemesi durumda
                Aidat aidat = new Aidat(index);
                aidat.setPaymentStatus(false);
                aidatList.add(aidat);
            }
        }
        return aidatList;
    }

    /**
     * Daireleri olusturan ve aidatlari icine atan method
     */
    private void createDaire() {
        for (int index = 1; index <= 10; index++) {
            ArrayList<Aidat> totalAidatList=createAidat();
            Daire daire = new Daire(totalAidatList, index);
            double totalAidatPrice=findTotalAidat(daire.getDaireList());
            double financialStatement=findFinancialStatement(totalAidatPrice);
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
    private double findTotalAidat( ArrayList<Aidat> pAidatList) {
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
    private double findFinancialStatement(double pTotalAidat){
        double result=pTotalAidat-totalAidatPrice;
        return round(result);
    }

    /**
     * Bilancoyu ekranda gösteren method
     * @param result
     * @param pNumberDaire
     */
    private void showFinancialStatement(double result,int pNumberDaire){
        System.out.println(pNumberDaire+". Daire Yil sonu bilancosu: "+result+ " Fr");

    }

    /**
     * Manageri Baslatan method
     */
    public void start(){
        createDaire();
    }
}
