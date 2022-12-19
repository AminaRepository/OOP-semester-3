/*public void addProduct(String product, int price, int stock), adding to the storehouse a product
whose price and number of stocks are the parameter values
public int price(String product) returns the price of the parameter product;
if the product is not available in the storehouse, the method returns -99
Inside the storehouse, the prices (and soon also the stocks) of the products have to be stored into a
Map<String, Integer> variable! The type of the object so created can be HashMap,
but you should use the interface Map for the variable type
public int stock(String product) returns the stock of the parameter product.
public boolean take(String product) decreases the stock of the parameter product by one,
and it returns true if the object was available in the storehouse.
If the product was not in the storehouse, the method returns false, the product stock cannot go below zero*/

import java.util.*;

public class Storehouse {
    String product;
    double price;
    int stock;
    HashMap<String, Double> productPrice = new HashMap<>();
    HashMap<String, Integer> productStock = new HashMap<>();
    public Set<String> products = new HashSet<>();
    public void addProduct(String product, double price, int stock){
        this.product = product;
        this.price = price;
        this.stock = stock;
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
        this.products.add(product);
    }
    public double price(String product){
        for(String current : productPrice.keySet()){
            if(current.contains(product)){
                return this.productPrice.get(current);
            }
        }
        return -99;
    }
    public int stock(String product) {
        for(String current : productStock.keySet()){
            if(current.contains(product)){
                return this.productStock.get(current);
            }
        }
        return 0;
    }
    public boolean take(String product){
        for(String current : productStock.keySet()){
            if(current.contains(product)){
               if(productStock.get(current) > 0){
                   productStock.replace(current, (productStock.get(current) - 1));
                   return true;
               }
               return true;
            }
        }
        return false;
    }
}