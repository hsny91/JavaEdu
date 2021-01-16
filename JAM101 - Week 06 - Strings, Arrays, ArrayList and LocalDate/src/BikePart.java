import java.time.LocalDate;
import java.util.ArrayList;
public class BikePart {

    private static ArrayList<String> bikePartList = new ArrayList<>();

    public static void main(String [] args){
        addPartInList();
        createResultList();
    }

    private static void addPartInList() {
        bikePartList.add("tsla342");
        bikePartList.add("vw0929");
        bikePartList.add("tyt567");
        bikePartList.add("bmw6126");
        bikePartList.add("cabrio213");
        bikePartList.add("alfaromeo3234");
    }
    /**
     * Butun metodlari cagiran ve ekrana yazdiran Method
     */
    private static void createResultList () {
        bikePartList.stream()
                .map(BikePart::convertToUpperCase)
                .map(BikePart::reversePartName)
                .map(BikePart::addName)
                .map(BikePart::dropNumbers)
                .map(BikePart::addDate)
                .forEach(System.out::println);
    }

    /**
     * Parca isimleri büyük harflere cevrilecen Method
     * @return
     */
    private static String convertToUpperCase(String pPartName) {
        return pPartName.toUpperCase();
    }

    /**
     * Her parcanin basina ASLIAG_ ekleyen Method
     * @param pPartName
     * @return
     */
    private static String addName (String pPartName) {
        return"ASLIAG_"+pPartName;
    }

    /**
     * Parca isimleri tersine cevren Method
     * @param pPartName
     * @return
     */
    private static String reversePartName (String pPartName) {
        return new StringBuilder(pPartName).reverse().toString();
    }

    /**
     * Parca isimlerinden sayilar cikartan Method
     * @param pPartName
     * @return
     */
    private static String dropNumbers(String pPartName) {
        pPartName= pPartName.replaceAll("[0-9]","");
        return pPartName;
    }

    /**
     * Her parcanin sonuna ise parcanin sisteme girildigi tarih ekleyen Method.
     * @param pPartName
     * @return
     */
    public static String addDate(String pPartName){
        LocalDate date = LocalDate.now();
        return pPartName+date.toString();
    }

}
