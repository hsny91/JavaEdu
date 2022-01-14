package ch.hicoders.jam101.week01.ciftci;


import ch.hicoders.jam101.week01.ciftlik.Inek;
import ch.hicoders.jam101.week01.ciftlik.Tavuk;

public class Ciftci {
    public static void main(String[] args) {
        //Inekler
        Inek inek = new Inek("aysem");
        Inek inekOne = new Inek();
        Inek inekTwo = new Inek("Fatma");
        inek.inekIsim();
        inekOne.inekIsim();
        inekTwo.inekIsim();
        int toplamInekSayisi = inek.inekSayisi();
        System.out.println("Toplam Inek Sayisi: " + toplamInekSayisi);
        //Tavuklar
        Tavuk tavuk = new Tavuk("fatma");
        Tavuk tavukone = new Tavuk();
        tavuk.tavukIsim();
        tavukone.tavukIsim();
        int toplamTavukSayisi = tavuk.tavukSayisi();
        System.out.println("Toplam Tavuk Sayisi: " + toplamTavukSayisi);

    }
}
