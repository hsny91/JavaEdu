import java.util.ArrayList;

public class OrderLine {
    private Product product;
    private int productQuantit;
    private double totalItemPrice;

    public OrderLine(Product pProduct, int pPoductQuantit,double pTotalItemPrice){ ;
        this.product=pProduct;
        this.productQuantit=pPoductQuantit;
        this.totalItemPrice=pTotalItemPrice;
    }
}
