package ch.hicoders.jam101.week01.ciftlik;

public class Inek {
    private String isim="inek";
    static int toplamInekSayisi=0;
    public Inek(String isim){
        this.isim=isim;
        this.toplamInekSayisi++;
    }
    public Inek(){
        this.isim="inek " +toplamInekSayisi ;
        this.toplamInekSayisi++;
    }
    public void inekIsim(){
        System.out.println("inegin ismi:"+this.isim);
    }
    public static int  inekSayisi(){
        return  toplamInekSayisi;
    }
}

