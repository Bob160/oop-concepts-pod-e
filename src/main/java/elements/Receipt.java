package elements;

import java.util.Date;

public class Receipt {
    private final String itemName;
    private final Date date;
    private final String invoiceId;
    private final double totalAmount;
    private final int quantity;

    public Receipt(String itemName, Date date, String invoiceId, double totalAmount, int quantity) {
        this.itemName = itemName;
        this.date = date;
        this.invoiceId = invoiceId;
        this.totalAmount = totalAmount;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDate() {
        return date;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getQuantity() {
        return quantity;
    }

}
