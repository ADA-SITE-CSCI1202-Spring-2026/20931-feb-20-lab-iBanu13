import java.io.*;
public class Invoice {
    // a
    private String partNum;
    private String partDesc;
    private int quantity;
    private double price;

    //b
    public Invoice (String partNum, String partDesc, int quantity, double price) {
        this.partNum = partNum;
        this.partDesc = partDesc;
        
        // c
        if (quantity > 0)
            this.quantity = quantity;
        else
            this.quantity = 0;

        if (price > 0.0)
            this.price = price;
        else
            this.price = 0.0;
    }

    public String getPartNum(){
        return partNum;
    }
    public void setPartNum(String partNum){
        this.partNum = partNum;
    }

    public String getPartDesc(){
        return partDesc;
    }
    public void setPartDesc(String partDesc){
        this.partDesc = partDesc;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double price(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    // d
    public double getInvoiceAmount() {
        return quantity * price;
    }

}