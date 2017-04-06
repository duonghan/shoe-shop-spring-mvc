/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.Product;

/**
 *
 * @author duonghan
 */

public interface ProductDAO {
    public boolean insertProduct(Product product);
    public boolean updateProduct(Product product);
    public boolean deleteProduct(Product product);
    public Product findProduct(String name);
    public ArrayList<Product> getlstProduct();
    
}
