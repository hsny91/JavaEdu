import java.util.ArrayList;

public class Aidat {

    public int mounthNumber;
    public Boolean paymentStatus;
    public double amountOfPaid;

    public Aidat(int pMounthNumber){ ;
        this.mounthNumber=pMounthNumber;
    }
    public Aidat(int pMounthNumber,double pAmountOfPaid){ ;
        this.mounthNumber=pMounthNumber;
        this.amountOfPaid=pAmountOfPaid;
    }

    public Boolean getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
