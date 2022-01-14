import java.util.ArrayList;

public class Daire {

    private ArrayList<Aidat> daireList ;
    private int daireNo;

    public Daire(ArrayList<Aidat> pDaireList, int pDaireNo){ ;
        this.setDaireList(pDaireList);
        this.setDaireNo(pDaireNo);
    }

    public ArrayList<Aidat> getDaireList() {

        return daireList;
    }

    public void setDaireList(ArrayList<Aidat> daireList) {

        this.daireList = daireList;
    }

    public int getDaireNo() {

        return daireNo;
    }

    public void setDaireNo(int daireNo) {

        this.daireNo = daireNo;
    }
}
