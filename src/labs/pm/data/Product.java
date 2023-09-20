/*
 * © Sivapriya Sridhar, Oracle Java 17 Training
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * {@code Product} class represents properties and behaviors of the
 * product objects in the Project Management system.
 * <br>
 * Each product has an id and, name and price
 * <br>
 * Each product can have a discount , calculated based on a
 * {@link DISCOUNT_RATE discount rate}
 * @version 4.0
 * @author Sivapriya_Sridhar
 **/
public class Product {
    /** A constant that defines
    * {@link java.math.BigDecimal} value of the discount rate
     * <br>
     * Discount rate is 2%
    **/
    private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(2);
    private  int id;
    private  String name;
    private BigDecimal price;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        //price = BigDecimal.ONE;
        this.price = price;
    }
    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }
}
