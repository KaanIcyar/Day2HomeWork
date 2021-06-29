import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Product product1 = new Product();
        product1.id = 1;
        product1.name = "Bottle of Water";

        Product product2 = new Product();
        product2.id = 2;
        product2.name = "Mouse";

        Product product3 = new Product();
        product3.id = 3;
        product3.name = "Cup";


        Category category1 = new Category();
        category1.id = 100;
        category1.name = "Drinks";

        Category category2 = new Category();
        category2.id = 101;
        category2.name = "Computer Components";

        Category category3 = new Category();
        category3.id = 102;
        category3.name = "Glassware";


        ProductManager productManager = new ProductManager();
        productManager.add(product3);
        productManager.add(product2);
        productManager.add(product1);
        productManager.delete(product2);


    }

}