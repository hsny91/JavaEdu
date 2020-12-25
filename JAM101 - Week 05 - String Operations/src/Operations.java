
import java.util.Random;

public class Operations {
    public static void main(String[] args){
        convertToUpperCase("asik veysel");
        doStars(6);
        findPrimeNumber();
        renderMatris();
        generatePassword();
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

    /**
     * 1 den 100 kadar olan sayilari 10x10 seklinde ve her sayinin arasinda virgul olacak sekilde yazdiran fonksiyon
     * Oncelille 1-100 arasindaki sayilari StringBuild'in(numberList) icinde atiyor.10 ve 10 nun katlarina altsatira
     * gececek sekilde baska bir stringBuilder'e(totalString) atiyor ve bunu ekrana yazdiriyor.
     */
    private static void renderMatris(){
        System.out.println("\n10x10 Matris: ");
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
        System.out.println("Prime Numbers: ");
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
     *  Kucuk, buyuk, ozel karakterler ve sayilardan olusan 8 ile 16 (hane) uzunluklari arasinda guvenli 50 adet sifre olusturan fonksiyon
     */
    private static void generatePassword() {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        System.out.println("Passwords: ");
        for (int index = 0; index < 50; index++) {
            int passwordLength = random.nextInt(8) + 8;
            char[] password = new char[passwordLength];
            password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
            password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
            password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
            password[3] = numbers.charAt(random.nextInt(numbers.length()));
            for (int indexPass = 4; indexPass < passwordLength; indexPass++) {
                password[indexPass] = combinedChars.charAt(random.nextInt(combinedChars.length()));
            }
            System.out.println(password);
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


