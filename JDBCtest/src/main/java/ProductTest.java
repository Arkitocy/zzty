import Bean.Product;
import Controller.ProductService;

import java.util.ArrayList;
import java.util.Date;

public class ProductTest {
    public static void main(String[] args) {
        Product product1 = new Product("产品1", "日用", new Date(), new Date(2019 - 1900, 10, 11, 15, 00, 0));
        Product product2 = new Product("产品2", "万用", new Date(), new Date(2019 - 1900, 10, 11, 15, 00, 0));
        ProductService ps = new ProductService();
        ps.addProduct(product1);
        ps.addProduct(product2);
//        ps.deleteProduct("产品1","日用");
//        ps.updateProduct("产品1","日用",product2);
//        Product p =ps.showProduct("产品2","万用");
        ArrayList<Product> ap = ps.showAll();


    }
}
