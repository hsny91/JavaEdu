import java.time.LocalDate;


public class Product {
    public String productName;
    public double productPrice;
    public double stockVolume;
    public LocalDate createDate;


    public Product(String pProductName,double pProductPrice,double pStockVolume){ ;
        this.productName=pProductName;
        this.productPrice=pProductPrice;
        this.stockVolume=pStockVolume;
        this.createDate=LocalDate.now();
    }
}
