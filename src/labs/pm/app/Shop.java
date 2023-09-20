/*
 * © Sivapriya Sridhar, Oracle Java 17 Training
 */
package  labs.pm.app;

import labs.pm.data.Product;

import java.math.BigDecimal;
/**
 * {@code Shop} class represents an application that manages Products
 * @version 4.0
 * @author Sivapriya_Sridhar
 **/
public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));

        System.out.println("Id:"+ p1.getId()+" Name:"+p1.getName()+" Price:"+p1.getPrice()+" Discount: "+p1.getDiscount());
    }
}