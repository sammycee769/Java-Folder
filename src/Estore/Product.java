package Estore;

public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private double productPrice;
    private ProductCategory productCategory;

    public  Product(int productId, String productName, String productDescription, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }
}
