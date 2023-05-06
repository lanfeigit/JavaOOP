/*
 * Student Name: Fei Lan
 * Lab professor: Leanne Seaward
 * Due Date: Mar 31, 2023
 * Modified: Mar 31, 2023
 * Description: This is the solution for Lab 6.
 */

package programmer;

/**
 * The Invoice class implements Payme interface.
 * 
 * @author Lanfei
 *
 */
public class Invoice implements Payme {
/**
 * the parNumber of invoice
 */
private String partNumber; 
/**
 * the partDescription of invoice
 */
private String partDescription;
/**
 * the quantity of invoice
 */
private int quantity;
/**
 * the paricePerItem of invoice
 */
private double pricePerItem;

/**
 * four-argument constructor
 * @param part
 * @param description
 * @param count
 * @param price
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); 
 setPricePerItem(price); 
}

/**
 * set part number
 * @param part
 */
public void setPartNumber(String part) {
 partNumber = part; 
}

/**
 * get part number
 * @return 
 */
public String getPartNumber() {
 return partNumber;
}

/**
 * the description of part
 * @param description the description of part
 */
 
public void setPartDescription(String description) {
 partDescription = description; 
}

/**
 * get description
 * @return the description of the part 
 */
public String getPartDescription() {
 return partDescription;
}

/**
 * set quantity
 * @param the quantity of invoice
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; 
}

/**
 * get quantity
 * @return the quantity of the invoice
 */
public int getQuantity() {
 return quantity;
}

/**set price per item
 * 
 * @param the price 
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; 
}

/**
 * get price per item
 * @return price the price of per item
 */
public double getPricePerItem() {
 return pricePerItem;
}

/**
 * return String representation of Invoice object
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * method required to carry out contract with interface Payme
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); 
}
}


