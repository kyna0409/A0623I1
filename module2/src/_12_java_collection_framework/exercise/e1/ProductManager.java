package _12_java_collection_framework.exercise.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductManager {
    private List<Product> products ;
    public ProductManager()
    {
        products= new ArrayList<>();
    }
    public void createProduct(Product product)
    {
        products.add(product);
    }
    public Product deleteProduct(String id)
    {
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId().equals(id))
            {
                return products.remove(i);
            }
        }
        return null;
    }

}
