import java.util.ArrayList;
import java.util.Random;

public class OnlineSale {
    private Random random = new Random();
    Stock stock=new Stock();
    private  ArrayList<OrderLine> OrderList=new ArrayList<>();
    private ArrayList<Product> productArrayList= stock.getTotalProduct();
    public OnlineSale(){
        addProduct();
        showOrderList();
        showLastStock();
    }

    /**
     * siparis listesine urun ekleyen method.
     */
    private void addProduct(){
        int randomProductIndex=generateRandomProduct();
        Product orderProduct= productArrayList.get(randomProductIndex);////secilen urun
        int productQuantit=generateRandomProductQuantit();// o urunden kac tane secildigi

        if(productQuantit<=orderProduct.stockVolume){  // istenen urun sayisi stoktan az ise
            double TotalPrice=productQuantit*(orderProduct.productPrice);
            OrderLine orderLine = new OrderLine(orderProduct,productQuantit,TotalPrice);
            OrderList.add(orderLine);
            int lastStockValue= (int) (orderProduct.stockVolume-productQuantit);
            updateStockVolume(randomProductIndex,lastStockValue);

        }
        else{ // stoktan fazla urun istenilirse stokta olan kadar urun verilir
            System.out.println("********** Yeteri kadar urunumuz yok **********");
            double TotalPrice=orderProduct.stockVolume*(orderProduct.productPrice);
            OrderLine orderLine = new OrderLine(orderProduct,productQuantit,TotalPrice);
            OrderList.add(orderLine);
            updateStockVolume(randomProductIndex,0);//stok tukenmesi durumu
        }

    }

    /**
     * Hangi urun satin alinacagini indeksini random olarak belirleme
     * @return
     */
    private int generateRandomProduct(){
        int  productIndex=random.nextInt(10);
        return productIndex;
    }

    /**
     * secilen urunden kac tane satin alinacagini random olarak belirleme
     * @return
     */
    private int generateRandomProductQuantit(){
        int  productQuantit=random.nextInt(10)+1;
        return productQuantit;
    }

    /**
     * Stok durumunu guncelleyen method
     * @param pProductIndex
     * @param stockQuantite
     */
    private void updateStockVolume(int pProductIndex,int stockQuantite){
        productArrayList.get(pProductIndex).stockVolume=stockQuantite;
    }

    /**
     * Stoktaki kalan urunleri gosteren method
     */
    private void showLastStock(){
        System.out.println("**********Stocktaki Kalan urunlerimiz**********");
        for(Product product:productArrayList){
            System.out.println("Product name : "+product.productName
                    + " Product Price: " + product.productPrice
                    + " Stock Volume:"+ product.stockVolume
                    + " Create Date: "+ product.createDate
            );

        }
    }

    /**
     * Siparisleri gosteren method
     */
    public void showOrderList(){
        System.out.println("**********Siparislerimiz**********");
        for(OrderLine order:OrderList){
            System.out.println("Product Name: "+order.getProduct().productName+
                             " Product Price: "+order.getProduct().productPrice+
                             " Order Total Price: "+order.getTotalItemPrice() +
                             " Order Quantities: " + order.getProductQuantit()

            );
        }
    }
}
