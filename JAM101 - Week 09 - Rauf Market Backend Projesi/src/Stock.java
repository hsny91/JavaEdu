import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Stock {
    private ArrayList<Product> totalProduct=new ArrayList<>();
    private int totalPrice;
    private Random random = new Random();

    public Stock(){ ;
        showProductList();
    }

    /**
     *  Urunleri olusturan metod
     * @return
     */
    private ArrayList<Product> generateProducts(){
        for(int i=1;i<=10;i++){
            int stokVolume=random.nextInt(10) + 1;
            double price=random.nextDouble()*200;   // urunfiyatlari da random olarak olarak atandi.
            Product product = new Product("product"+i, price, stokVolume);
            totalProduct.add(product);
        }
        return totalProduct;

    }
    private void showProductList(){
        ArrayList<Product> productArrayList=generateProducts();
        for(Product product:productArrayList){
            System.out.println("Product name : "+product.productName
                    + " Product Price: " + product.productPrice
                    + " Stock Volume:"+ product.stockVolume
                    + " Create Date: "+ product.createDate
            );

        }
    }

    public ArrayList<Product> getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(ArrayList<Product> totalProduct) {
        this.totalProduct = totalProduct;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}

