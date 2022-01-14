package ch.hicoders.jam101.week01.ciftlik;

public class Tavuk {
    private String isim;
    static int toplamTavukSayisi = 0;
    public Tavuk(String isim) {
        this.isim = isim;
        toplamTavukSayisi ++;
    }
    public Tavuk() {
        this.isim = "Tavuk "+toplamTavukSayisi;
        toplamTavukSayisi ++;
    }
    public void tavukIsim() {
        System.out.println("Tavugun ismi: " + this.isim);
    }
    public static int  tavukSayisi(){
        return  toplamTavukSayisi;
    }
}

