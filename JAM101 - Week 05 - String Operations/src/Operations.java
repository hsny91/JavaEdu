public class Operations {
    public static void main(String[] args){
        convertToUpperCase("asik veysel");
        doStars(6);
        System.out.println("Prime Numbers: ");
        findPrimeNumber();
    }
    /**
     *  String olarak verilen bir isim ve soyismin sadece bas harflerini Uppercase'e cevirme.
     */
    private static StringBuilder convertToUpperCase(String pnameSurname){
        String[] nameSurnameList=pnameSurname.split(" ");
        StringBuilder capitalNameSurname = new StringBuilder();
        for (String name:nameSurnameList) {
            capitalNameSurname.append(Character.toUpperCase(name.charAt(0))).append(name.substring(1)).append(" ");
        }
        System.out.println(capitalNameSurname);
        return capitalNameSurname;
    }
    private static void renderMatris(){
        /*int [] numberList = new int[100];
        String totalString = "";
        for (int index = 1; index <= 100; index++) {
            numberList.add(index);
            if (index % 10 == 0) {
                totalString += numberList.join(",") + "\n";
                numberList.length = 0;
            }
        }*/
        //console.log(totalString);
    }
    /**
     * Asal sayilari bulan ve ekrana yazdiran method
     */
    private static void  findPrimeNumber(){
        int maxBoundary=100;
        for (int primeNumber = 2; primeNumber < maxBoundary; primeNumber++) {
            boolean controlPrime = true;
            for (int divisorNumber = 2; divisorNumber < primeNumber; divisorNumber++) {
                if (primeNumber % divisorNumber == 0) {
                    controlPrime = false;
                    break;
                }
            }
            if (controlPrime) {
                System.out.print(primeNumber+",");
            }
        }
    }
    /**
     * yildizlar ile dik ucgen cizen method
     */
    private static void doStars(int plenght){
        for (int row= 0; row <= plenght; row++) {
            for (int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


}
