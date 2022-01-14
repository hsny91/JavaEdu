public class OrderLine {
    private Product product;
    private int productQuantit;
    private double totalItemPrice;

    public OrderLine(Product pProduct, int pPoductQuantit,double pTotalItemPrice){ ;
        this.setProduct(pProduct);
        this.setProductQuantit(pPoductQuantit);
        this.setTotalItemPrice(pTotalItemPrice);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductQuantit() {
        return productQuantit;
    }

    public void setProductQuantit(int productQuantit) {
        this.productQuantit = productQuantit;
    }

    public double getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(double totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }
}
