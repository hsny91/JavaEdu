import java.util.Arrays;

public class Operations {
    public static void main(String[] args){
        convertToUpperCase("asik veysel");
    }
    /**
     *  String olarak verilen bir isim ve soyismin sadece bas harflerini Uppercase'e cevirme.
     */
    private static String[] convertToUpperCase(String pnameSurname){
        String[] newNameList=pnameSurname.split(" ");
        System.out.println(Arrays.toString(newNameList));
        for (String name:newNameList) {
          //name = name.charAt(0);
        }
        return newNameList;
    }
}
