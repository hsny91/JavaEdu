import java.util.ArrayList;

public class OrderedProduct {
    private ArrayList<OrderLine> orderList ;
    private Double totalPrice;

    public OrderedProduct(ArrayList<OrderLine> pOrderList, Double pTotalPrice){ ;
        this.orderList=pOrderList;
        this.totalPrice=pTotalPrice;
    }
}
