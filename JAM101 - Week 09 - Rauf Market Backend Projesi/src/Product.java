import java.util.Date;

public class Product {
    public String productName;
    public double productPrice;
    public double stockVolume;
    public Date createDate;


    public Product(String pProductName,double pProductPrice,double pStockVolume, Date pCreateDate){ ;
        this.productName=pProductName;
        this.productPrice=pProductPrice;
        this.stockVolume=pStockVolume;
        this.createDate=pCreateDate;
    }
}
