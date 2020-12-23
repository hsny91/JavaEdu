public class Operations {
    public static void main(String[] args){
        convertToUpperCase("asik veysel");
        doStars(6);
        System.out.println("Prime Numbers: ");
        findPrimeNumber();
        System.out.println("\n10x10 Matris: ");
        renderMatris();
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
    }/**
     * 1 den 100 kadar olan sayilari 10x10 seklinde yazdiran fonksiyon
     * Oncelille 1-100 arasindaki sayilari StringBuild'in(numberList) icinde atiyor.10 ve 10 nun katlarina altsatira
     * gececek sekilde baska bir stringBuilder'e(totalString) atiyor ve bunu ekrana yazdiriyor.
     */
    private static void renderMatris(){
        StringBuilder numberList = new StringBuilder();
        StringBuilder totalString = new StringBuilder();
        for (int index = 1; index <= 100; index++) {
            numberList.append(index).append(",");
            if (index % 10 == 0) {
                totalString.append(numberList).append("\n") ;
                numberList.setLength(0);
            }
        }
        System.out.println(totalString);
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
